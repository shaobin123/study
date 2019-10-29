package com.example.demo.com.shiro;

import com.example.demo.Service.UserService;
import com.example.demo.model.Permission;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UserRealm  extends AuthorizingRealm {

    @Autowired
    private UserService userService;



    /**
     * 用户授权
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principalCollection) {

        System.out.println("==*******************=执行授权=********************==");

        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        if(user != null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            // 角色与权限字符串集合
            Collection<String> rolesCollection = new HashSet<>();
            Collection<String> premissionCollection = new HashSet<>();
            // 读取并赋值用户角色与权限
            Set<Role> roles = user.getRoles();
            for(Role role : roles){
                rolesCollection.add(role.getName());
                Set<Permission> permissions = role.getPermissions();
                for (Permission permission : permissions){
                    premissionCollection.add(permission.getUrl());
                }
                info.addStringPermissions(premissionCollection);
            }
            info.addRoles(rolesCollection);
            return info;
        }
        return null;
    }

    /**
     * 用户认证
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {

        System.out.println("==***************=执行认证=*************************==");

        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        User bean = userService.findByName(token.getUsername());

        if(bean == null){
            throw new UnknownAccountException();//返回null也可以
        }

        ByteSource credentialsSalt = ByteSource.Util.bytes(bean.getName());

        return new SimpleAuthenticationInfo(bean, bean.getPassword(),
                credentialsSalt, getName());
    }

    // 模拟Shiro用户加密，假设用户密码为123456
   public static void main(String[] args){
        // 用户名
        String username = "admin";
        // 用户密码
        String password = "1234";
        // 加密方式
        String hashAlgorithName = "MD5";
        // 加密次数
        int hashIterations = 1024;
        ByteSource credentialsSalt = ByteSource.Util.bytes(username);
        Object obj = new SimpleHash(hashAlgorithName, password,
                credentialsSalt, hashIterations);
        System.out.println(obj);
    }

}
