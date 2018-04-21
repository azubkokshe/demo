package com.example.demo.dao;

import com.example.demo.model.Question;

import java.util.List;
import java.util.Map;

public interface QuestionMapper extends BaseMapper <Question, String>{
    List<Question> findListByRand(Map map);
}