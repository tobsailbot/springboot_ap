package com.portfolioapp.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descripcion;
    private String desde;
    private String hasta;
    private String institucion;

    
    public Education() {
    }
    
    public Education (Long id,
                    String titulo,
                    String descripcion,
                    String desde,
                    String hasta,
                    String institucion){
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.desde = desde;
        this.hasta = hasta;
        this.institucion = institucion;
    }
}
