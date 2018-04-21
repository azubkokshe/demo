package com.example.demo.service.impl;

import com.example.demo.dao.ModuleMapper;
import com.example.demo.model.Module;
import com.example.demo.service.ModuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {

    @Resource
    private ModuleMapper moduleMapper;

    @Override
    public List<Module> findAllModule() {
        return moduleMapper.findList(null);
    }
}
