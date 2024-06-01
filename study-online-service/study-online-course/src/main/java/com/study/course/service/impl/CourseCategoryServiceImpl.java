package com.study.course.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.course.mapper.CourseCategoryMapper;
import com.study.course.service.CourseCategoryService;
import com.study.model.course.dto.CourseCategoryTreeDto;
import com.study.model.course.po.CourseCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CourseCategoryServiceImpl extends ServiceImpl<CourseCategoryMapper, CourseCategory> implements CourseCategoryService{


    @Autowired
    private CourseCategoryMapper courseCategoryMapper;

    @Override
    public List<CourseCategoryTreeDto> queryTreeNodes(String id) {
        //调用mapper递归查询出分类信息
        List<CourseCategoryTreeDto> courseCategoryTree = courseCategoryMapper.selectTreeNodes(id);

        //找到每个结点的子节点, 最终封装成List<CourseCategoryTreeDto>
        //先将list转成map, key就是结点的id, value就是CourseCategoryTreeDto对象, 目的就是为了方便从map获取结点
        Map<String, CourseCategoryTreeDto> mapTemp = courseCategoryTree.stream()
                .filter(item -> !id.equals(item.getId()))
                .collect(Collectors.toMap(CourseCategory::getId, value -> value, (key1, key2) -> key2));
        //定义一个list作为最终返回的list
        List<CourseCategoryTreeDto> courseCategoryList = new ArrayList<>();

        //从头遍历List<CourseCategoryTreeDto>, 一边遍历一边找子节点放在父节点的childrenTreeNodes
        courseCategoryTree.stream()
                .filter(item -> !id.equals(item.getId()))
                .forEach(item -> {
            if (item.getParentid().equals(id)){
                courseCategoryList.add(item);
            }
            //找到结点的父节点
            CourseCategoryTreeDto courseCategoryParent = mapTemp.get(item.getParentid());
            if (courseCategoryParent != null){
                if (courseCategoryParent.getChildrenTreeNodes() == null){
                    //如果该父节点的ChildrenTreeNodes属性为空要new一个集合，应为要向该集合中放它的子节点
                    courseCategoryParent.setChildrenTreeNodes(new ArrayList<>());
                }
                //到每个结点的子节点放在父节点的childrenTreeNodes属性中
                courseCategoryParent.getChildrenTreeNodes().add(item);
            }
        });
        return courseCategoryList;
    }
}
