package com.example.demo.Service;

import com.example.demo.mapper.RoleMapper;
import com.example.demo.model.Role;
public interface RoleService{


    int insert(Role record);

    int insertSelective(Role record);

}
