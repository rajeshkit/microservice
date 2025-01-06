package com.shivu.orderservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shivu.orderservice.dto.OrderRequest;
import com.shivu.orderservice.model.Orders;
import com.shivu.orderservice.model.Product;
import com.shivu.orderservice.model.Users;
import com.shivu.orderservice.repository.OrderRepository;
import com.shivu.orderservice.repository.ProductRepository;
import com.shivu.orderservice.repository.UserRepository;

@Service
public class OrderService {
    @Autowired
	RestTemplate restTemplate;
    @Autowired
    OrderRepository orderRepo;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductRepository productRepository;
   
    public Orders placeOrder(OrderRequest orderRequest){
    	
    	// user email
    	// product id and quantity
    	
    	
    	
    	
    	
        System.out.println("called service method"+orderRequest.getEmail_id());
        Users users = restTemplate.getForObject("http://localhost:9393/api/users/email/"+orderRequest.getEmail_id(),
        		Users.class);       
        System.out.println(users);
        Users user1 = userRepository.save(users);
        float totalCost=0;
        for (Integer productId : orderRequest.getOrderedProductIdQuantityList().keySet()) {
            Integer productQuantity = orderRequest.getOrderedProductIdQuantityList().get(productId);
           
            Product product=restTemplate.getForObject("http://localhost:9191/api/products/"+productId, Product.class);
            if(product!=null){
            	totalCost = totalCost + productQuantity * product.getPrice();
                productRepository.save(product);
            }
        } 
        List<Product> list = productRepository.findAllById(orderRequest.getOrderedProductIdQuantityList().keySet());
        Orders order=new Orders();
        order.setUsers(user1);
        order.setProducts(list);
        order.setTotalCost(totalCost);
        System.out.println(order);
        orderRepo.save(order);
        return  order;
    }
    public List<Orders> getAllOrders(){
    	return orderRepo.findAll();
    }
}
