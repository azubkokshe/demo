package com.example.demo.service;

/**
 * 试题服务
 */
public interface PaperService {
    /**
     * 模拟试题
     * @param userId
     */
    void combinationTestPaper(String userId);

    /**
     * 章节试题
     * @param userId
     */
    void combinationChapterPaper(String userId, String moduleId);
}
