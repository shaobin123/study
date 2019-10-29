package com.example.demo.Configuration;

import com.example.demo.com.shiro.UserRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {


    @Bean("hashedCredentialsMatcher")
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher credentialsMatcher =
                new HashedCredentialsMatcher();
        //指定加密方式为MD5
        credentialsMatcher.setHashAlgorithmName("MD5");
        //加密次数
        credentialsMatcher.setHashIterations(1024);
        credentialsMatcher.setStoredCredentialsHexEncoded(true);
        return credentialsMatcher;
    }

    @Bean("userRealm")
    public UserRealm userRealm(@Qualifier("hashedCredentialsMatcher")
                                       HashedCredentialsMatcher matcher) {

        UserRealm userRealm = new UserRealm();
        userRealm.setCredentialsMatcher(matcher);
        return userRealm;
    }

    @Bean
    public ShiroFilterFactoryBean shirFilter(@Qualifier("securityManager")
                                                     DefaultWebSecurityManager securityManager) {

        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        // 设置 SecurityManager
        bean.setSecurityManager(securityManager);
        // 设置登录成功跳转Url
        bean.setSuccessUrl("/main");
        // 设置登录跳转Url
        bean.setLoginUrl("/toLogin");
        // 设置未授权提示Url
        bean.setUnauthorizedUrl("/error/unAuth");

        /**
         * anon：匿名用户可访问
         * authc：认证用户可访问
         * user：使用rememberMe可访问
         * perms：对应权限可访问
         * role：对应角色权限可访问
         **/
        Map<String, String> filterMap = new LinkedHashMap<>();
        /*filterMap.put("/login","anon");
        filterMap.put("/city/index","anon");//跳转测试页面
        filterMap.put("/aaa","anon");//跳转测试页面
        filterMap.put("/user/index","authc");
       // filterMap.put("/vip/index","roles[vip]");//角色名称是vip的
        filterMap.put("/vip/index","perms[user:vip]");//有权限路径才可以访问
        //filterMap.put("/vip/index", "perms[user:post]");//method 为post get delete 等
        filterMap.put("/druid/**", "anon");
        filterMap.put("/static/**","anon");
        filterMap.put("/**","authc");
        filterMap.put("/logout", "logout");*/

        bean.setFilterChainDefinitionMap(filterMap);
        return bean;
    }

    /**
     * 注入 securityManager
     */
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(
            HashedCredentialsMatcher hashedCredentialsMatcher) {

        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 关联realm.
        securityManager.setRealm(userRealm(hashedCredentialsMatcher));
        return securityManager;
    }

/*  @Bean(name = "lifecycleBeanPostProcessor")
    public static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor(){
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public static DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator =new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor =new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager((org.apache.shiro.mgt.SecurityManager) new SecurityManager());
        return authorizationAttributeSourceAdvisor;
    }*/

}
