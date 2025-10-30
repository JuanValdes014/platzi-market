package com.platzi_market.web.controller;

import com.platzi_market.domain.Product;
import com.platzi_market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getAll() {
        return productService.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productService.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productService.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productService.save(product);
    }

    public boolean delete(int productId) {
        return productService.delete(productId);
    }
}
