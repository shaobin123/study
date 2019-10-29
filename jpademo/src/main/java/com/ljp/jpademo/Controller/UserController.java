package com.ljp.jpademo.Controller;

import com.ljp.jpademo.entity.User;
import com.ljp.jpademo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> findAll() {
        return userService.findAll();
    }
}
