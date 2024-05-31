package com.study.course.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.model.common.dtos.PageParams;
import com.study.model.common.dtos.PageResult;
import com.study.model.course.dto.QueryCourseParamsDto;
import com.study.model.course.po.CourseBase;

/**
 * <p>
 * 课程基本信息 服务类
 * </p>
 *
 * @author itcast
 * @since 2024-05-30
 */
public interface CourseBaseService extends IService<CourseBase> {

    /**
     * 课程查询接口
     * @param pageParams
     * @param dto
     * @return
     */
    PageResult<CourseBase> searchList(PageParams pageParams, QueryCourseParamsDto dto);
}
