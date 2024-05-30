package com.study.course.controller;

import com.study.model.common.dtos.PageParams;
import com.study.model.common.dtos.PageResult;
import com.study.model.course.dto.QueryCourseParamsDto;
import com.study.model.course.po.CourseBase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseBaseInfoController {

    @PostMapping("/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto dto){
        return null;
    }
}
