package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {
    // id
    private Integer id;
    // 名称
    private String name;
    // 详情
    private String description;
    // 图片
    private List<String> image;
    // 价格
    private BigDecimal price;
    // 库存
    private Integer stock;
    // 类别： 手办、小说、漫画等
    private Integer categoryId;
    // IP：FGO、碧蓝航线、哔哩哔哩等
    private String ip;
    // 品牌：出版商或制造商
    private String brand;
    // 标签：如尺寸、材质等
    private List<Tally> tags;
    // 售卖状态
    private Integer isSelled;
    // sku
    private String sku;
}
