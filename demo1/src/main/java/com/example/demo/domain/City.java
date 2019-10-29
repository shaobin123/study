package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.util.StringUtils;

public class City {
    private String cityId;

    private String cityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String remark;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        if(!StringUtils.isEmpty(remark)){

            this.remark = remark;
        }else{
            this.remark = null;
        }
    }
}