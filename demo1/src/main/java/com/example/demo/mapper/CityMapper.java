package com.example.demo.mapper;

import Dto.citydto;
import com.example.demo.domain.City;

import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(citydto citydto);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(String cityId);

    int updateByPrimaryKeySelective(City record);
    List<City> getAll();
    int updateByPrimaryKey(City record);
}