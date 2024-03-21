package com.teddy.springbootmall.dto;

import com.teddy.springbootmall.constant.ProductCategory;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Data
public class ProductRequest {
    @NotNull
    String name;
    ProductCategory category;
    Integer price;
    String description;
}
