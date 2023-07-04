package com.example.controller;

import com.example.pojo.Result;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EucliwoodHellsycthe
 */
@Api(tags = "购物车服务")
@RestController
public class ShoppingCartController {
    @GetMapping("/cart")
    @ApiOperation(value = "购物车添加操作", notes = "购物车操作接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productId", value = "品牌名称", dataType = "string", paramType = "query",required = true),
            @ApiImplicitParam(name = "quantity", value = "数量", dataType = "integer", paramType = "query",required = true),
            @ApiImplicitParam(name = "userId", value = "用户id", dataType = "integer", paramType = "query",required = true)
    })
    public Result addToCart(String userId, String productId, Integer quantity) {
        return Result.success(null);
    }

    @GetMapping("/checkout")
    @ApiOperation(value = "购物车删除操作", notes = "购物车操作接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "productId", value = "品牌名称", dataType = "string", paramType = "query",required = true),
            @ApiImplicitParam(name = "quantity", value = "数量", dataType = "integer", paramType = "query",required = true),
            @ApiImplicitParam(name = "userId", value = "用户id", dataType = "integer", paramType = "query",required = true)
    })
    public Result removeFromCart(String userId, String productId, Integer quantity) {
        return Result.success(null);
    }
}
