package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.Date;

@Builder
@Data
public class PaperDetail {
    private String id;

    private String paperId;

    private String questionId;

    private String answer;

    private Double score;

    private Integer titleNumber;

    private Date createTime;

    @Tolerate
    private PaperDetail() {}

}