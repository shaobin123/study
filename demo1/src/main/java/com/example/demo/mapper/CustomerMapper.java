package com.example.demo.mapper;

import com.example.demo.domain.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(String userId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}