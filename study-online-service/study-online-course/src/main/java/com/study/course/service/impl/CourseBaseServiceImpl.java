package com.study.course.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.course.mapper.CourseBaseMapper;
import com.study.course.service.CourseBaseService;
import com.study.model.common.dtos.PageParams;
import com.study.model.common.dtos.PageResult;
import com.study.model.course.dto.QueryCourseParamsDto;
import com.study.model.course.po.CourseBase;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseBaseServiceImpl extends ServiceImpl<CourseBaseMapper, CourseBase> implements CourseBaseService {

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    /**
     * 课程查询接口
     * @param pageParams
     * @param dto
     * @return
     */
    @Override
    public PageResult<CourseBase> searchList(PageParams pageParams, QueryCourseParamsDto dto) {
        //1.检查分页参数
        pageParams.checkParam();

        //2.创建分页对象
        Page page = new Page(pageParams.getPageNo(), pageParams.getPageSize());
        LambdaQueryWrapper<CourseBase> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //3.课程名称模糊查询
        if (StringUtils.isNotBlank(dto.getCourseName())){
            lambdaQueryWrapper.like(CourseBase::getName, dto.getCourseName());
        }
        //4.课程审核状态
        if (StringUtils.isNotBlank(dto.getAuditStatus())){
            lambdaQueryWrapper.eq(CourseBase::getAuditStatus, dto.getAuditStatus());
        }
        //5.课程发布状态
        if (StringUtils.isNotBlank(dto.getPublishStatus())) {
            lambdaQueryWrapper.eq(CourseBase::getStatus, dto.getPublishStatus());
        }
        page = page(page, lambdaQueryWrapper);
        //结果返回
        return new PageResult<CourseBase>(
                page.getRecords(),
                page.getTotal(),
                pageParams.getPageNo(),
                pageParams.getPageSize());
    }
}
