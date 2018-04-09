package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.Date;

@Builder
@Data
public class WrongQuestion {
    private String id;

    private String questionId;

    private String userId;

    private Date createTime;

    @Tolerate
    private WrongQuestion() {}

}