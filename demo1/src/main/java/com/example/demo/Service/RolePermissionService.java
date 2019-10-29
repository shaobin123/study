package com.example.demo.Service;

import com.example.demo.mapper.RolePermissionMapper;
import com.example.demo.model.RolePermission;
public interface RolePermissionService{


    int insert(RolePermission record);

    int insertSelective(RolePermission record);

}
