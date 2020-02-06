package com.java.dao;

import com.java.domain.User;
import com.java.mybatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    List<User> findAll();
}
