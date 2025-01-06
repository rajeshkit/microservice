package com.shivu.orderservice.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Map<Integer,Integer> orderedProductIdQuantityList;
    private String email_id;
    
}
