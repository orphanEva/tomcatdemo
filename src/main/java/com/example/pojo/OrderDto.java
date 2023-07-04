package com.example.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "订单数据接收对象", description = "用于接收订单数据的对象")
public class OrderDto {
    @ApiModelProperty(value="用户id",required = true, example = "011")
    private String userId;
    @ApiModelProperty(value="地址",required = true, example = "杭州市拱墅区...")
    private String address;
    @ApiModelProperty(value="商品列表",required = true, example = "[1,2,3,4,5]")
    private List<Integer> items;
    @ApiModelProperty(value="手机号",required = true, example = "136-8888-9999")
    private String phone;
    @ApiModelProperty(value="姓名",required = true, example = "小白")
    private String name;
}
