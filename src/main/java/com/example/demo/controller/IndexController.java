package com.example.demo.controller;

import com.alibaba.druid.util.StringUtils;
import com.example.demo.constants.Constants;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.LoginUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "index_example";
    }

    @RequestMapping("/to_question")
    public String toQuestion() {
        return "question";
    }

    @RequestMapping("/question")
    public String addQuestion(HttpServletRequest request) {
        if (LoginUtil.isLogin(request)) {
            return "question";
        }
        return "index_example";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request) {
        String loginName = request.getParameter("userName");
        String password = request.getParameter("password");

        User user = userService.getUser(loginName);
        if (StringUtils.equals(password, user.getPassword())) {
            request.getSession().setAttribute("user", user);
            return Constants.OK;
        } else {
            return Constants.NOT_ALLOW;
        }
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String mobile = request.getParameter("mobile");
        String type = request.getParameter("type");

        userService.add(userName, password, mobile, type);

        return "注册成功";
    }
}
