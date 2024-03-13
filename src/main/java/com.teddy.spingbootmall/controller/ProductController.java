package com.teddy.spingbootmall.controller;

import com.teddy.spingbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teddy.springbootmall.model.Product;

@RestController
public class ProductController {

    @RequestMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId, @Autowired ProductService productService){
        Product product = productService.getProductById(productId);
        if(product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }

    }


}
