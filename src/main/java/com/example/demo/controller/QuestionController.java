package com.example.demo.controller;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Question;
import com.example.demo.service.QuestionService;
import com.example.demo.utils.UUIDUtils;
import com.example.demo.constants.Constants;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class QuestionController {
    @Resource
    private QuestionService questionService;

    @RequestMapping(
            value = "/add",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8"
    )
    public void add(@RequestParam int type, @RequestParam String title,
                    @RequestParam String content,
                    @RequestParam double score, @RequestParam String knowledge,
                    @RequestParam int level, @RequestParam String moduleId,
                    @RequestParam String correctAnswer) {

        boolean notAdd = StringUtils.isEmpty(title) || (StringUtils.isEmpty(content) && type != Constants.TRUE_OR_FALSE);
        if (notAdd) {
            return;
        }

        //组织试题题干
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(Constants.QUESTION_TITLE, title);

        //判断题默认对和错两个选项
        JSONArray jsonArray = new JSONArray();
        if (type == Constants.TRUE_OR_FALSE) {
            jsonArray.add(Constants.TRUE);
            jsonArray.add(Constants.FALSE);
        } else {
            String[] answers = content.split(Constants.SEMICOLON);
            if (answers.length != Constants.CHOOSE_LENGTH) {
                return;
            } else {
                for (String answer : answers) {
                    jsonArray.add(answer);
                }
            }
        }
        jsonObject.put(Constants.QUESTION_CHOOSE, jsonArray);


        Question question = Question.builder()
                .id(UUIDUtils.uuid())
                .type(type)
                .score(score)
                .correctAnswer(correctAnswer)
                .level(level)
                .moduleId(moduleId)
                .content(jsonObject.toJSONString())
                .knowledge(knowledge)
                .createTime(new Date())
                .build();
        questionService.add(question);
    }

    @RequestMapping(value = "/get",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public Question get() {
        return questionService.findQuestions("564a2c16d31d4309");
    }

    @RequestMapping(value = "/findList",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public List<Question> findList() {
        return questionService.findQuestionList(null, null, null, null);
    }
}
