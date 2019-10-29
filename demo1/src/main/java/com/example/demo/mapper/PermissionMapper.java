package com.example.demo.mapper;

import com.example.demo.model.Permission;

public interface PermissionMapper {
    int insert(Permission record);

    int insertSelective(Permission record);
}