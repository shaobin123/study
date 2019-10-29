package com.example.demo.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Role {
    private String id;

    private String name;
    private Set<Permission> permissions = new HashSet<>();

}