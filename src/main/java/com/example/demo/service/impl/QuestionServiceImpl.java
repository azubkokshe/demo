package com.example.demo.service.impl;

import com.example.demo.dao.QuestionMapper;
import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public List<Question> findQuestionList(Integer type, Integer questionAuth, Integer level, String moduleId) {
        Map<String, Object> map = new HashMap<>(4);
        if (type != null) {
            map.put("type", type);
        }

        if (questionAuth != null) {
            map.put("questionAuth", questionAuth);
        }

        if (level != null) {
            map.put("level", level);
        }

        if (moduleId != null) {
            map.put("moduleId", moduleId);
        }
        return questionMapper.findList(map);
    }
}
