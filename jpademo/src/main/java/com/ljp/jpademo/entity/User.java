package com.ljp.jpademo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id   // 表明id
    @GeneratedValue   //  自动生成
    private Long id ;

    private String name ;

}
