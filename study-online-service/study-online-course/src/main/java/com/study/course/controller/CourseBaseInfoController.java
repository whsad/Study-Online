package com.study.course.controller;

import com.study.course.service.CourseBaseService;
import com.study.model.common.dtos.PageParams;
import com.study.model.common.dtos.PageResult;
import com.study.model.course.dto.QueryCourseParamsDto;
import com.study.model.course.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/content/course")
@Api(value = "课程信息管理接口", tags = "课程信息管理接口")
public class CourseBaseInfoController {

    @Autowired
    private CourseBaseService courseBaseService;

    @PostMapping("/list")
    @ApiOperation("课程查询接口")
    public PageResult<CourseBase> list(
            @ModelAttribute PageParams pageParams,
            @RequestBody(required = false) QueryCourseParamsDto dto)
    {
        return courseBaseService.searchList(pageParams, dto);
    }
}
