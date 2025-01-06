package com.shivu.orderservice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	@Id
    private Long id;
    private String username;
    private String password;
    private String email;
//    @OneToOne(cascade = CascadeType.ALL)
//    private Orders orders;
//   
}
