package com.shivu.orderservice.model;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id 
    private int id;
    private String name;
    private String description;
    private Float price; 
    private int quantity;
    
   
}
