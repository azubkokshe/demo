package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.Date;

@Builder
@Data
public class Paper {
    private String id;

    private String userId;

    private String questionId;

    private String paperId;

    private Double score;

    private Integer questionCount;

    private Integer correctCount;

    private Integer wrongCount;

    private Date createTime;

    @Tolerate
    private Paper() {}

}