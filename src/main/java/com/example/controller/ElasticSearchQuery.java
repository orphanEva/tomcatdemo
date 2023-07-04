package com.example.controller;

import com.example.pojo.Result;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author EucliwoodHellsycthe
 */
@Api(tags = "Es服务")
@RestController
public class ElasticSearchQuery {
    @ApiOperation(value = "Es模糊检索", notes = "使用Es进行模糊检索")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "keyword", value = "要搜索的内容", dataType = "String", paramType = "query", required = true)
    })
    @GetMapping("/searchData")
    public Result searchData(String keyword) {
        return Result.success(null);
    }
}
