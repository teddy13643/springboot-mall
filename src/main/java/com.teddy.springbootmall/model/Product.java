package com.teddy.springbootmall.model;

import com.teddy.springbootmall.constant.ProductCategory;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "products")
public class Product {
        @Id
        Integer id;
        String name;
        @Enumerated(EnumType.STRING)
        @Column(name = "category")
        ProductCategory category;
        Integer price;
        Integer stock;
        String description;
        Date createdAt; // 用格林威治時間 +0 來表示
        Date lastModified;

}