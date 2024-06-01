package com.study.course;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.study.course.mapper.CourseBaseMapper;
import com.study.course.mapper.CourseCategoryMapper;
import com.study.course.service.CourseCategoryService;
import com.study.model.course.dto.CourseCategoryTreeDto;
import com.study.model.course.po.CourseBase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = CourseApplication.class)
@RunWith(SpringRunner.class)
public class CourseBaseTest {

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @Autowired
    private CourseCategoryMapper courseCategoryMapper;

    @Autowired
    private CourseCategoryService courseCategoryService;

    @Test
    public void testCourseBaseMapper(){
        LambdaQueryWrapper<CourseBase> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    }

    @Test
    public void testTree(){
        List<CourseCategoryTreeDto> courseCategoryTreeDtos = courseCategoryService.queryTreeNodes("1");
        System.out.println(courseCategoryTreeDtos);
    }
}
