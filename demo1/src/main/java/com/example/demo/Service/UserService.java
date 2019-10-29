package com.example.demo.Service;

import com.example.demo.model.User;
import com.example.demo.mapper.UserMapper;
public interface UserService{





    User findByName(String name);

}
