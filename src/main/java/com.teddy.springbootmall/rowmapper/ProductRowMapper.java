package com.teddy.springbootmall.rowmapper;

import com.teddy.springbootmall.constant.ProductCategory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import com.teddy.springbootmall.model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        /*--一步一腳印做法
        Product product = new Product();
        product.setId(rs.getInt("id"));
        product.setName(rs.getString("name"));
        product.setCategory(ProductCategory.valueOf(rs.getString("category")));//枚舉轉換
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));
        product.setCreatedAt(rs.getDate("created_at"));
        product.setLastModified(rs.getDate("last_modified"));
        return product;
        --*/

        /*--快速做法--*/
        BeanPropertyRowMapper<Product> beanRowMapper = new BeanPropertyRowMapper<>(Product.class);

        Product product = beanRowMapper.mapRow(rs, rowNum); //確定是product沒錯。因為全部的mapRow做完之後，priductList才會出現
        product.setCategory(ProductCategory.valueOf(rs.getString("category")));//枚舉轉換

        return product;

    }

}
