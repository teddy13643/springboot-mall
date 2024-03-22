package com.teddy.springbootmall.service;

import com.teddy.springbootmall.constant.ProductCategory;
import com.teddy.springbootmall.model.Product;

import java.util.Optional;

public interface ProductService {

    Optional<Product> findProductById(Integer productId);

    Optional<Product> findProductByCategory(ProductCategory category);
}
