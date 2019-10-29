package com.example.demo.Service;

import com.example.demo.mapper.UserRoleMapper;
import com.example.demo.model.UserRole;
public interface UserRoleService{


    int insert(UserRole record);

    int insertSelective(UserRole record);

}
