package com.study.course.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.model.course.dto.CourseCategoryTreeDto;
import com.study.model.course.po.CourseCategory;

import java.util.List;

public interface CourseCategoryService extends IService<CourseCategory> {

    List<CourseCategoryTreeDto> queryTreeNodes(String id);


}
