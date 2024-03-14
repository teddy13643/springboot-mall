package com.teddy.springbootmall.rowmapper;

import com.teddy.springbootmall.constant.ProductCategory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import com.teddy.springbootmall.model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        BeanPropertyRowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        Product product = rowMapper.mapRow(rs, rowNum);
        if (product != null) {
            product.setCategory(ProductCategory.valueOf(rs.getString("category")));//枚舉轉換
        }
        return product;

    }

}
