package com.shivu.productservice.exception;

public class ProductNotFoundException extends RuntimeException{
   
    public ProductNotFoundException(){
        super("Product details not exists in the product database");
       
       
    }

}
