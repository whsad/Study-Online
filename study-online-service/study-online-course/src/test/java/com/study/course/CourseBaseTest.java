package com.study.course;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.study.course.mapper.CourseBaseMapper;
import com.study.model.course.po.CourseBase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CourseApplication.class)
@RunWith(SpringRunner.class)
public class CourseBaseTest {

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @Test
    public void testCourseBaseMapper(){
        LambdaQueryWrapper<CourseBase> lambdaQueryWrapper = new LambdaQueryWrapper<>();

    }
}
