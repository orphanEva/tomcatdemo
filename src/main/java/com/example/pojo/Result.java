package com.example.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(value = "返回结果类", description = "这是一个包含用户定义数据的类")
public class Result {
    @ApiModelProperty(value="响应码",required = true, example = "200")
    private Integer code;
    @ApiModelProperty(value="返回的数据",required = true, example = "list or entity")
    private Object data;
    @ApiModelProperty(value="响应消息",required = true, example = "操作成功")
    private String message;

    public static Result success(Object data){
        return new Result(200,data,"操作成功");
    }

    public static Result error(Integer code,String message){
        return  new Result(code,null,"操作失败");
    }
    public static Result fail(Integer code, Object data, String message){
        return new Result(code,data,message);
    }
}
