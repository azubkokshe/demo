package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    void add(String userName, String pwd, String mobile, String userType);

    User getUser(String loginName);
}
