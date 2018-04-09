package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import java.util.Date;

@Builder
@Data
public class Module {
    private String id;

    private String moduleName;

    private Integer questionCount;

    private Date createTime;

    @Tolerate
    private Module() {}
}