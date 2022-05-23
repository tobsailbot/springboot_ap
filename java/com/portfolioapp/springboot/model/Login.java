package com.portfolioapp.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Login {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String user_name;
    private String password;

    
    public Login() {
    }
    
    public Login (Long id,
                    String user_name,
                    String password){
        this.id = id;
        this.user_name = user_name;
        this.password = password;

    }
}
