package com.shivu.productservice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivu.productservice.model.Product;
import com.shivu.productservice.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo;
 
    public void createProduct(Product product){
       

        productRepo.save(product);
        
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    

    public Product getProductById(int id) {
        Optional<Product> optionalProd = productRepo.findById(id);
        if(optionalProd.isPresent()){
            return optionalProd.get();
        }
        return null;
    }
}
