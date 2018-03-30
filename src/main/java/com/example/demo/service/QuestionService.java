package com.example.demo.service;

import com.example.demo.model.Question;

public interface QuestionService {
    Question findQuestions(String id);

    long add(Question question);
}
