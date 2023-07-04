package com.example.controller;

import com.example.pojo.OrderDto;
import com.example.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author EucliwoodHellsycthe
 */
@Api(tags = "订单服务")
@RestController
public class OrderController {
    @ApiOperation(value = "创建订单", notes = "创建订单的方法")
    @PostMapping("/CreatOrders")
    public Result CreatOrders(@RequestBody OrderDto orderDto) {
        return Result.success(null);
    }
    @ApiOperation(value = "退订单", notes = "根据订单号来退订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", value = "订单号", dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "userId", value = "用户id", dataType = "Integer", paramType = "query")
    })
    @GetMapping("/CancelOrders")
    public Result CancelOrders(String orderId, Integer userId) {
        return  Result.success(null);
    }
    @ApiOperation(value = "获取所有订单列表", notes = "获取所有订单列表")
    @GetMapping("/GetOrders")
    public Result GetOrders() {
        return Result.success(null);
    }

}
