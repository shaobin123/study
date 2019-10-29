package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.mapper.UserRoleMapper;
import com.example.demo.model.UserRole;
import com.example.demo.Service.UserRoleService;
@Service
public class UserRoleServiceImpl implements UserRoleService{

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public int insert(UserRole record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRole record) {
        return userRoleMapper.insertSelective(record);
    }

}
