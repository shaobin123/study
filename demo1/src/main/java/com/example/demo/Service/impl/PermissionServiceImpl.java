package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.mapper.PermissionMapper;
import com.example.demo.model.Permission;
import com.example.demo.Service.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService{

    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public int insert(Permission record) {
        return permissionMapper.insert(record);
    }

    @Override
    public int insertSelective(Permission record) {
        return permissionMapper.insertSelective(record);
    }

}
