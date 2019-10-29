package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.model.Role;
import com.example.demo.Service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleMapper roleMapper;

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

}
