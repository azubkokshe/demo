package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void add(String userName, String pwd, String mobile, String userType) {
        User user = User.builder()
                .id(UUIDUtil.uuid())
                .userName(userName)
                .userType(Integer.parseInt(userType))
                .mobile(mobile)
                .password(pwd)
                .createTime(new Date())
                .build();

        userMapper.insert(user);
    }

    @Override
    public User getUser(String loginName) {
        return userMapper.selectByNameOrMobile(loginName);
    }
}
