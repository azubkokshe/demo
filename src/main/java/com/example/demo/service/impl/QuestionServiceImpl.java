package com.example.demo.service.impl;

import com.example.demo.dao.QuestionMapper;
import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Resource
    private QuestionMapper questionMapper;

    @Override
    public Question findQuestions(String id) {
        return questionMapper.selectByPrimaryKey(id);
    }

    @Override
    public long add(Question question) {
        return questionMapper.insert(question);
    }
}
