package com.example.demo.controller;

import com.example.demo.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class userController {


    /**
     * 个人中心，需认证可访问
     */
    @RequestMapping("/user/index")
    public String add(HttpServletRequest request){
     /*   User bean = (User) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute("userName", bean.getName());*/
        return "/user/index";
    }

    /**
     * 会员中心，需认证且角色为vip可访问
     */
    @RequestMapping("/vip/index")
    public String update(){
        return "/vip/index";
    }
    @RequestMapping("/aaa")
    public String update1(){
        return "/user/aaaa";
    }
    @RequestMapping("/a/getWxsdkSign")
    public String update12(){

        return "aaaaaaaa";
    }
}
