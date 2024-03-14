package com.teddy.springbootmall.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import com.teddy.springbootmall.model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        BeanPropertyRowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return rowMapper.mapRow(rs, rowNum);

    }

}
