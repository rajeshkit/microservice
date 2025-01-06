package com.shivu.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shivu.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
