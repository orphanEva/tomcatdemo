package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EucliwoodHellsycthe
 */
@RestController
@Api(tags = "简单测试")
public class Test {
    @GetMapping("/testString")
    @ApiOperation(value = "测试String类型的操作", notes = "测试String类型操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", dataType = "string", paramType = "query", value = "名字"),
            @ApiImplicitParam(name = "get")
    })

    public String testString(String name, int age){
        return "测试成功";
    }

    @GetMapping("/test")
    public String test(){
        return "测试成功";
    }
}
