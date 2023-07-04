package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.DateFormat;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    // id
    private Integer id;
    // 唯一id
    private String orderId;
    // 用户id
    private Integer uid;
    // 用户名称
    private String uname;
    // 收货地址
    private String addr;
    // 联系方式
    private String pnum;
    // 下单时间
    private DateFormat ftime;
    // 商品id
    private Integer gid;
    // 商品名称
    private String gnme;
    // 商品sku
    private String gsku;
    // 商品数量
    private Integer gcnt;
    // 商品单价价
    private BigDecimal gprice;
    // 优惠前价格
    private BigDecimal gcprice;
    // 优惠后价格
    private BigDecimal gppprice;
    // 优惠度
    private Double glevel;
    // 最终价格
    private BigDecimal gpriceall;
    // 订单状态
    private Integer ordstatus;
    // 发货状态
    private Integer orddel;
    // 物流信息
    private String log;
    // 备注
    private String remark;
}
