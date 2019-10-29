package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.Service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;


    @Override
    public User findByName(String name) {
        // 查询用户是否存在
        User bean = userMapper.findByName(name);
        if (bean != null) {
            // 查询用户信息、角色、权限
            bean = userMapper.findById(bean.getId());
        }
        return bean;
    }

}
