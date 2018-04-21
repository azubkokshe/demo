package com.example.demo.service;

import com.example.demo.model.Module;

import java.util.List;

public interface ModuleService {
    /**
     * 获取所有模块
     *
     * @return
     */
    List<Module> findAllModule();
}
