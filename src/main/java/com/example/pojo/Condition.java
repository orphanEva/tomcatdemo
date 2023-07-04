package com.example.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "条件查询对象", description = "用于接收条件查询的每个值的对象")
public class Condition {
    @ApiModelProperty(value = "条件类型", example = "1")
    private Integer type;
    @ApiModelProperty(value = "价格", example = "1.0")
    private BigDecimal price;
    @ApiModelProperty(value = "商品名称", example = "2233手办海边别墅版")
    private String name;
}
