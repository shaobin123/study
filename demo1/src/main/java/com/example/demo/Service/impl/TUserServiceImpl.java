package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.domain.TUser;
import com.example.demo.mapper.TUserMapper;
import com.example.demo.Service.TUserService;
@Service
public class TUserServiceImpl implements TUserService{

    @Resource
    private TUserMapper tUserMapper;

    @Override
    public int deleteByPrimaryKey(String userId) {
        return tUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(TUser record) {
        return tUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TUser record) {
        return tUserMapper.insertSelective(record);
    }

    @Override
    public TUser selectByPrimaryKey(String userId) {
        return tUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(TUser record) {
        return tUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUser record) {
        return tUserMapper.updateByPrimaryKey(record);
    }

}
