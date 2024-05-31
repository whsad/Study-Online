package com.study.model.common.dtos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Mr.M
 * @version 1.0
 * @description 分页查询分页参数
 * @date 2023/2/11 15:33
 */
@Data
@ApiModel(description = "分页查询参数")
public class PageParams {

    //当前页码
    @ApiModelProperty(value = "页码", example = "1")
    private Long pageNo;
    //每页显示记录数
    @ApiModelProperty(value = "每页记录数", example = "10")
    private Long pageSize;

    public void checkParam(){
        if (this.pageNo == null || this.pageNo <0){
            setPageNo(1L);
        }
        if (this.pageSize == null || this.pageSize < 0 || this.pageSize > 100){
            setPageSize(10L);
        }
    }
}
