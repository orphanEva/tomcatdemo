package com.example.controller;

import com.example.pojo.Condition;
import com.example.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EucliwoodHellsycthe
 */
@Api(tags = "商品管理")
@RestController
public class CommodityController {
    @ApiOperation(value = "查询全部商品", notes = "查询全部商品")
    @GetMapping("/queryAll")
    public Result queryAll(){
        return Result.success(null);
    }
    @ApiOperation(value = "查询商品的详细信息", notes = "查询指定商品的详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "商品id", dataType = "string", paramType = "query",required = true)
    })
    @GetMapping("/queryCommodity")
    public Result queryCommodity(String id){
        return Result.success(null);
    }
    @ApiOperation(value = "根据条件查询商品", notes = "查询符合条件的所有商品")
    @PostMapping("/queryCommodityByCondition")
    public Result queryCommodityByCondition(@RequestBody Condition condition){
        return Result.success(null);
    }
}
