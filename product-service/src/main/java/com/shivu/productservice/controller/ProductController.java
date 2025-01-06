package com.shivu.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shivu.productservice.exception.ProductNotFoundException;
import com.shivu.productservice.model.Product;
import com.shivu.productservice.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productservice;

    @GetMapping
    public List<Product> getAllProducts(){
        return productservice.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        Product prod = productservice.getProductById(id);
        if(prod != null) {
        	return prod;
        } else{
            throw new ProductNotFoundException();
        }
      
    }
    @GetMapping("/name/{name}")
    public Product getProductByName(@PathVariable String name) {
       
        return null;
      
    }
    @PostMapping
    public void createProduct(@RequestBody Product product){
        productservice.createProduct(product);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product productRequest ){

    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id){
        
    }   
    

    
}
