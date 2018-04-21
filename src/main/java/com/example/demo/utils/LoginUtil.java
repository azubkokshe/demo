package com.example.demo.utils;

import com.example.demo.model.User;

import javax.servlet.http.HttpServletRequest;

/**
     * 登录工具类
     *
     * @author yuwanyi
     * @date 16:39 2018/4/13
     */
public class LoginUtil {

    public static boolean isAllowed(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            return true;
        }
        return false;
    }

    public static boolean isLogin(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            return true;
        }
        return false;
    }
}
