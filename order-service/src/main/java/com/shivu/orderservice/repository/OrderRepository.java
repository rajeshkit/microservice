package com.shivu.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivu.orderservice.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
    
}
