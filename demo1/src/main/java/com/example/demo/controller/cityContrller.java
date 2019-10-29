package com.example.demo.controller;


import Dto.citydto;
import base.BaseController;
import com.example.demo.Service.CityService;
import com.example.demo.domain.City;
import com.example.demo.mapper.CityMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import resp.Response;

import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping(value = "/city")
public class cityContrller extends BaseController {

   public  cityContrller(){
       initLogger(getClass());
   }

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private CityService cityService;

    /**
     * 添加
     * @param city
     * @return
     */
    @PostMapping("/add")
    public Response addUser(@RequestBody City city){
        logger.info("--------------城市添加--------------");
        return cityService.insert(city);
    }


    @PostMapping("/getCity")
    public Response select ( String cityId){
        return cityService.selectByPrimaryKey(cityId);
    }

    /**
     * 列表数据
     * @return
     */
    @PostMapping("/getAll")
    public Response getAll (){
        logger.info("---------------------查询列表-------------------------");
        return cityService.selectByPrimaryKey();
    }

    /**
     * 删除
     * @param citydto
     * @return
     */
    @PostMapping("/del")
    public Response del(@RequestBody citydto citydto){
        logger.info("---------------------删除数据-------------------------");
        return cityService.deleteByPrimaryKey(citydto);
    }

    @PostMapping("/modify")
    public Response modify(@RequestBody City city){
        return cityService.updateByPrimaryKeySelective(city);
    }

    /**
     * 测试thymeleaf
     * @param map
     * @return
     */
    @GetMapping("/index")
    public String index(Map<String,Object> map){
        logger.info("进入",map);
        map.put("hello","你好");
        map.put("a","这其实是一段语句");
        return "test";
    }
}
