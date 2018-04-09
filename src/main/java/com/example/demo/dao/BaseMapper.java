package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseMapper <T, PK extends Serializable> {
    int deleteByPrimaryKey(PK id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(PK id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> findList(Map map);
}
