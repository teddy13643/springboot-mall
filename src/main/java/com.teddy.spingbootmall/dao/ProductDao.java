package com.teddy.spingbootmall.dao;

import com.teddy.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
