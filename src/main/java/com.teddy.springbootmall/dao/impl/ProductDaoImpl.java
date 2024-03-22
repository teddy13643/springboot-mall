package com.teddy.springbootmall.dao.impl;

import com.teddy.springbootmall.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.teddy.springbootmall.model.Product;
import com.teddy.springbootmall.rowmapper.ProductRowMapper;

@Component
public class ProductDaoImpl  { //TODO 未來如果JAP生不出來，這裡會實作比較複雜的數據訪問邏輯，然後目前沒用倒就是ㄌ

    /* 使用JDBC的方法
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    */

    /* 使用JDBC的方法
    @Override
    public Product getProductById(Integer productId) {
       String sql = "select * from products where id = :productId";

       Map<String, Object> map = new HashMap<>();
       map.put("productId", productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());
        if (productList.size() > 0) {
            return productList.get(0); // 僅一筆
        }else{
            return null;
        }
    }
    */
}
