package com.example.demo.service.impl;

import com.example.demo.dao.PaperDetailMapper;
import com.example.demo.dao.PaperMapper;
import com.example.demo.dao.QuestionMapper;
import com.example.demo.model.Paper;
import com.example.demo.model.PaperDetail;
import com.example.demo.model.Question;
import com.example.demo.service.PaperService;
import com.example.demo.utils.UUIDUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

@Service
public class PaperServiceImpl implements PaperService {

    @Resource
    private PaperMapper paperMapper;

    @Resource
    private PaperDetailMapper paperDetailMapper;

    @Resource
    private QuestionMapper questionMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void combinationTestPaper(String userId) {
        Paper paper = Paper.builder()
                .id(UUIDUtil.uuid())
                .userId(userId)
                .score(100d)
                .createTime(new Date())
                .build();

        paperMapper.insert(paper);

        Map<String, Object> map = new HashMap<>();
        //判断题
        map.put("type", 0);
        map.put("pageSize", 60);
        List<Question> judgList = questionMapper.findListByRand(map);

        //单选题
        map.put("type", 1);
        map.put("pageSize", 100);
        questionMapper.findListByRand(map);
        List<Question> singleList = questionMapper.findListByRand(map);

        //多选题
        map.put("type", 2);
        map.put("pageSize", 40);
        List<Question> multiList = questionMapper.findListByRand(map);

        List<Question> allList = new ArrayList<>();
        allList.addAll(judgList);
        allList.addAll(singleList);
        allList.addAll(multiList);

        allList.forEach(question -> {
            PaperDetail paperDetail = PaperDetail.builder()
                    .id(UUIDUtil.uuid())
                    .paperId(paper.getId())
                    .score(0.5)
                    .questionId(question.getId())
                    .createTime(new Date())
                    .build();

            paperDetailMapper.insert(paperDetail);
        });

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void combinationChapterPaper(String userId, String moduleId) {
        Paper paper = Paper.builder()
                .id(UUIDUtil.uuid())
                .userId(userId)
                .createTime(new Date())
                .build();

        paperMapper.insert(paper);

        //根据模块获取试题
        Map<String, Object> map = new HashMap<>();
        map.put("moduleId", moduleId);
        List<Question> questionList = questionMapper.findList(map);

        questionList.forEach(question -> {
            PaperDetail paperDetail = PaperDetail.builder()
                    .id(UUIDUtil.uuid())
                    .paperId(paper.getId())
                    .score(0.5)
                    .questionId(question.getId())
                    .createTime(new Date())
                    .build();

            paperDetailMapper.insert(paperDetail);
        });

    }
}
