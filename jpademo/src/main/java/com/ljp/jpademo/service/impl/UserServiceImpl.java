package com.ljp.jpademo.service.impl;

import com.ljp.jpademo.Dao.UserDao;
import com.ljp.jpademo.entity.User;
import com.ljp.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl  implements UserService {


    @Autowired
    private UserDao userDAO;

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

}
