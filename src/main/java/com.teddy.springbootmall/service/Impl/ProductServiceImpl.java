package com.teddy.springbootmall.service.Impl;

import com.teddy.springbootmall.constant.ProductCategory;
import com.teddy.springbootmall.dao.ProductDao;
import com.teddy.springbootmall.service.ProductService;
import com.teddy.springbootmall.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;
    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Optional<Product> findProductById(Integer productId) {
        return this.productDao.findById(productId);
    }

    @Override
    public Optional<Product> findProductByCategory(ProductCategory category) {
        return this.productDao.findByCategory(category);
    }
}
