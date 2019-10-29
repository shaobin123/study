package com.ljp.jpademo.Dao;

import com.ljp.jpademo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface UserDao  extends JpaRepository<User,Long> {




}
