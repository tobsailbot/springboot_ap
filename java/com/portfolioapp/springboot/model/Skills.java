package com.portfolioapp.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String habilidad;
    private Integer porcentaje;

    
    public Skills() {
    }
    
    public Skills (Long id,
                    String habilidad,
                    Integer porcentaje){
        this.id = id;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;

    }
}
