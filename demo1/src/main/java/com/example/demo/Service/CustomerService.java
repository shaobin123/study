package com.example.demo.Service;

import com.example.demo.domain.Customer;
import com.example.demo.mapper.CustomerMapper;
public interface CustomerService{


    int deleteByPrimaryKey(String userId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

}
