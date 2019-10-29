package com.example.demo.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class User {
    private String id;

    private String name;

    private String password;
    private Set<Role> roles = new HashSet<>();
}