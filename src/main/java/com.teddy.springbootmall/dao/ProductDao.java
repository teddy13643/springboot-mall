package com.teddy.springbootmall.dao;

import com.teddy.springbootmall.constant.ProductCategory;
import com.teddy.springbootmall.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductDao extends JpaRepository<Product, Integer> {

    Optional<Product> findByCategory(ProductCategory category);

}
