package com.teddy.spingbootmall.service.Impl;

import com.teddy.spingbootmall.dao.ProductDao;
import com.teddy.spingbootmall.service.ProductService;
import com.teddy.springbootmall.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Override
    public Product getProductById(Integer productId,@Autowired  ProductDao productDao) {
        return productDao.getProductById(productId);
    }

    @Override
    public Product getProductById(Integer productId) {
        return null;
    }
}
