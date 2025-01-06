package com.shivu.productservice.exception;

public class ProductNameNotExistsException extends RuntimeException{
   public ProductNameNotExistsException(){
        super("product is not exists in the product DB");
    }

}
