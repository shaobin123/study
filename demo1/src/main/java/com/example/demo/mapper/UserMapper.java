package com.example.demo.mapper;

import com.example.demo.model.User;

public interface UserMapper {


    // 查询用户信息
    User findByName(String name);

    // 查询用户信息、角色、权限
    User findById(String id);
}