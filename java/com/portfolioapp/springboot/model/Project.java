package com.portfolioapp.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String tipo;
    private String link;
    private String img_url;

    
    public Project() {
    }
    
    public Project (Long id,
                    String nombre,
                    String tipo,
                    String link,
                    String img_url){
        
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.link = link;
        this.img_url = img_url;

    }
}
