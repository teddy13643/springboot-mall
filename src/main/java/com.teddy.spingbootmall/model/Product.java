package com.teddy.springbootmall.model

@Data
public class Product {
        //TODO 寫好變數之後
        private Integer productID;
        private String productName;
        private String category;
        private String imageUrl;
        private Integer price;
        private Integer stock;
        private String description;
        private Date createDate;
        private Date lastModifiedDate;
}