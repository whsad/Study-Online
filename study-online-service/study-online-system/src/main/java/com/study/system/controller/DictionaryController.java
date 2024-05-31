package com.study.system.controller;

import com.study.model.system.po.Dictionary;
import com.study.system.service.DictionaryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/system/dictionary")
@Api(value = "字典管理接口", tags = "字典管理接口")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/all")
    @ApiOperation("字段查询接口")
    public List<Dictionary> queryAll(){
        return dictionaryService.list();
    }


}
