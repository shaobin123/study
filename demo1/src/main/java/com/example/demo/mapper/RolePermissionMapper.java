package com.example.demo.mapper;

import com.example.demo.model.RolePermission;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
}