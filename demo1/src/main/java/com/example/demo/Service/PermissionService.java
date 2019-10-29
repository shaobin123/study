package com.example.demo.Service;

import com.example.demo.mapper.PermissionMapper;
import com.example.demo.model.Permission;
public interface PermissionService{


    int insert(Permission record);

    int insertSelective(Permission record);

}
