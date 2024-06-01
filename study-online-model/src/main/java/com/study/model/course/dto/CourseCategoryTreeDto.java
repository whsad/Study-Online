package com.study.model.course.dto;

import com.study.model.course.po.CourseCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {
    @ApiModelProperty(value = "子节点")
    private List<CourseCategoryTreeDto> childrenTreeNodes;
}
