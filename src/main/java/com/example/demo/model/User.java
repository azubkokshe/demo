package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.Date;

@Builder
@Data
public class User {
    private String id;

    private String userName;

    private String password;

    private String mobile;

    private Integer userType;

    private Date createTime;

    private Date modifyTime;

    private Date expireTime;

    @Tolerate
    private User() {}

}