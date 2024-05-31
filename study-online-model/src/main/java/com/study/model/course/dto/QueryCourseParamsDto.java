package com.study.model.course.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author Mr.M
 * @version 1.0
 * @description 课程查询条件模型类
 * @date 2023/2/11 15:37
 */
@Data
@ToString
@ApiModel(description = "课程查询条件模型类")
public class QueryCourseParamsDto {

    @ApiModelProperty(value = "审核状态")
    private String auditStatus;

    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @ApiModelProperty(value = "发布状态")
    private String publishStatus;

}
