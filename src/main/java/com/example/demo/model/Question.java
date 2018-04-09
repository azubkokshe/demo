package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.Date;

@Builder
@Data
public class Question {
    private String id;

    private Integer type;

    private Integer questionAuth;

    private Integer level;

    private String moduleId;

    private String correctAnswer;

    private String content;

    private String knowledge;

    private Double score;

    private Date createTime;

    @Tolerate
    private Question() {}

}