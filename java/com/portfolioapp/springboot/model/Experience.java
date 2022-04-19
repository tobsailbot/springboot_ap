package com.portfolioapp.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descripcion;
    private String desde;
    private String hasta;
    private String puesto;

    
    public Experience() {
    }
    
    public Experience (Long id,
                    String titulo,
                    String descripcion,
                    String desde,
                    String hasta,
                    String puesto){
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.descripcion = desde;
        this.descripcion = hasta;
        this.descripcion = puesto;
    }
}
