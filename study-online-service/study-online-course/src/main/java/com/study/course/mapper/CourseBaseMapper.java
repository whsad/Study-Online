package com.study.course.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.model.course.po.CourseBase;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 课程基本信息 Mapper 接口
 * </p>
 *
 * @author itcast
 */
@Mapper
public interface CourseBaseMapper extends BaseMapper<CourseBase> {

}
