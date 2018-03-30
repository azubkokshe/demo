package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import com.example.demo.utils.UUIDUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class QuestionController {
    @Resource
    private QuestionService questionService;

    @RequestMapping(
            value = "/add",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8"
    )
    public void add(@RequestParam int type, @RequestParam String content, @RequestParam double score) {
        Question question = new Question();
        question.setId(UUIDUtils.uuid());
        question.setType(type);
        question.setContent(content);
        question.setScore(score);
        questionService.add(question);
    }

    @RequestMapping(value = "/get",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public Question get() {
        return questionService.findQuestions("0da7cac463");
    }
}
