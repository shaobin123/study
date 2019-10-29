package com.example.demo.Service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.domain.Customer;
import com.example.demo.mapper.CustomerMapper;
import com.example.demo.Service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public int deleteByPrimaryKey(String userId) {
        return customerMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        return customerMapper.insertSelective(record);
    }

    @Override
    public Customer selectByPrimaryKey(String userId) {
        return customerMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return customerMapper.updateByPrimaryKey(record);
    }

}
