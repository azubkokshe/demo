package com.example.demo.dao;

import com.example.demo.model.User;

public interface UserMapper extends BaseMapper <User, String>{
    User selectByNameOrMobile(String loginName);
}