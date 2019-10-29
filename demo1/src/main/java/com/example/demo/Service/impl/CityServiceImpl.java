package com.example.demo.Service.impl;

import Dto.citydto;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.domain.City;
import com.example.demo.mapper.CityMapper;
import com.example.demo.Service.CityService;
import org.springframework.util.StringUtils;
import resp.BaseCode;
import resp.RespCode;
import resp.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CityServiceImpl implements CityService{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());//日志记录

    @Resource
    private CityMapper cityMapper;

    @Override
    public Response deleteByPrimaryKey(citydto citydto) {
        int i = cityMapper.deleteByPrimaryKey(citydto);
        if(i > 0){
            logger.info("删除成功");
            return Response.success("删除成功");
        }
        logger.info("删除失败");
        return Response.fail("删除失败");
    }


    @Override
    public Response insert(City record) {
        int i =cityMapper.insert(record);
        if(i<0){
            logger.info("添加失败");
            return Response.fail(RespCode.INSERT_FAIL);
        }
        logger.info("添加成功");
        return Response.success(RespCode.INSERT_SUCCESS);
    }

    @Override
    public Response insertSelective(City record) {
       try{
           int i = cityMapper.insertSelective(record);
           if (i < 0) {
               logger.info("信息:"+RespCode.INSERT_FAIL);
               return Response.fail(RespCode.INSERT_FAIL);
           }
           return Response.success(RespCode.INSERT_SUCCESS);
       }catch (Exception e){
           e.getStackTrace();
           logger.info("异常信息:",e.getMessage());
           return Response.fail("新增异常");
       }

    }

    @Override
    public Response selectByPrimaryKey(String cityId) {
        try{
            City city =cityMapper.selectByPrimaryKey(cityId);
            if(StringUtils.isEmpty(city)){
                return  Response.fail("查询失败");
            }
            return Response.success(city);

        }catch (Exception e){
            e.getStackTrace();
            logger.info("查询异常");
            return Response.fail("查询异常,稍后再试");
        }

    }

    /**
     * 查询列表信息
     * @return
     */
    @Override
    public Response selectByPrimaryKey() {
        int page=1;
        int size=2;
        PageHelper.startPage(page,size);
        List<City> cities = cityMapper.getAll();
        PageInfo<City> P =new PageInfo<>(cities);
        if(StringUtils.isEmpty(cities)){
            return Response.fail(BaseCode.USER_QUERY_FIAL);
        }
        logger.info("查询成功");
        return Response.success(P.getTotal(),P.getList());
    }

    @Override
    public Response updateByPrimaryKeySelective(City record) {
        try{
            int i = cityMapper.updateByPrimaryKeySelective(record);
            if(i > 0){
                logger.info("修改成功{}",record);
                return Response.success("修改成功");
            }
            logger.info("修改失败{}",i);
            return Response.fail("修改失败");
        }catch (Exception e){
            e.getStackTrace();
            return Response.fail("修改异常");
        }
    }

    @Override
    public int updateByPrimaryKey(City record) {
            return cityMapper.updateByPrimaryKey(record);

    }
}
