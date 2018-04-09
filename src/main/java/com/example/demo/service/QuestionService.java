package com.example.demo.service;

import com.example.demo.model.Question;

import java.util.List;

public interface QuestionService {
    Question findQuestions(String id);

    long add(Question question);

    List<Question> findQuestionList(Integer type, Integer questionAuth, Integer level, String moduleId);
}
