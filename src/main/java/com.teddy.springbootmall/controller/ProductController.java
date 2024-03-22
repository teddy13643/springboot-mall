package com.teddy.springbootmall.controller;

import com.teddy.springbootmall.constant.ProductCategory;
import com.teddy.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.teddy.springbootmall.model.Product;

import java.util.Optional;

@ControllerAdvice
@RestController
public class ProductController {

    private final ProductService productService;
    @Autowired
    private ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Object> getProduct(@PathVariable Integer productId){
        Optional<Product> product = productService.findProductById(productId);

        if (product.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
    }

    @GetMapping("/productsByCategory/{category}")
    public ResponseEntity<Object> getProduct(@PathVariable ProductCategory category){
        Optional<Product> product = productService.findProductByCategory(category);

        if (product.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }

    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // 在这里定义你的异常处理逻辑
        return new ResponseEntity<>( ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
