package com.study.model.common.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author Mr.M
 * @version 1.0
 * @description 分页查询结果模型类
 * @date 2023/2/11 15:40
 */
@Data
@ToString
@ApiModel("分页查询结果模型")
public class PageResult<T> implements Serializable {

    @ApiModelProperty(value = "数据列表")
    private List<T> items;

    @ApiModelProperty(value = "总记录数")
    private long counts;

    @ApiModelProperty(value = "当前页码")
    private long page;

    @ApiModelProperty(value = "每页记录数")
    private long pageSize;

    public PageResult(List<T> items, long counts, long page, long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }


}
