package com.study.course.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.model.course.dto.CourseCategoryTreeDto;
import com.study.model.course.po.CourseCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {

    List<CourseCategoryTreeDto> selectTreeNodes(String id);
}
