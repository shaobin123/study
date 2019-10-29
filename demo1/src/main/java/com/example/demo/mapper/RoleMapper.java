package com.example.demo.mapper;

import com.example.demo.model.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}