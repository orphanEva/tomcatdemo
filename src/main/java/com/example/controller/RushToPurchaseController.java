package com.example.controller;

import com.example.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EucliwoodHellsycthe
 */
@Api(tags = "抢购服务")
@RestController
public class RushToPurchaseController {
    @ApiOperation(value = "抢购", notes = "根据用户选择的商品进行抢购操作")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productId", value = "商品id", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "quantity", value = "商品数量", dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "用户名称", dataType = "String", paramType = "query")
    })
    @GetMapping("/rushToP")
    public Result rushToP(String productId, Integer quantity, String userId) {
        return Result.success(null);
    }
}
