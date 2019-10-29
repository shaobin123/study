package com.example.demo.Service;

import com.example.demo.domain.TUser;

public interface TUserService{


    int deleteByPrimaryKey(String userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

}
