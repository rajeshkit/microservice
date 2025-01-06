package com.shivu.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivu.orderservice.dto.OrderRequest;
import com.shivu.orderservice.model.Orders;
import com.shivu.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    OrderService orderService;
    
    @PostMapping
    public Orders placeOrder(@RequestBody OrderRequest orderRequest){
        System.out.println("called controller method");
        return orderService.placeOrder(orderRequest);
    }
    @GetMapping
    public List<Orders> getMethodName() {
        return orderService.getAllOrders();
    }
    
}
