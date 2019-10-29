package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.mapper.RolePermissionMapper;
import com.example.demo.model.RolePermission;
import com.example.demo.Service.RolePermissionService;
@Service
public class RolePermissionServiceImpl implements RolePermissionService{

    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public int insert(RolePermission record) {
        return rolePermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(RolePermission record) {
        return rolePermissionMapper.insertSelective(record);
    }

}
