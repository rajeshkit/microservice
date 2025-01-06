package com.shivu.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivu.orderservice.model.Product;




public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
