package com.example.demo.Service;

import Dto.citydto;
import com.example.demo.domain.City;
import resp.Response;

public interface CityService{


    Response deleteByPrimaryKey(citydto citydto);

    Response insert(City record);

    Response insertSelective(City record);

    Response selectByPrimaryKey(String cityId);

    /**
     * 查询列表
     * @return
     */
    Response selectByPrimaryKey();

    Response updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

}
