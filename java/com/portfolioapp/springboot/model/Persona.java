package com.portfolioapp.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String redes_sociales;
    private String titulo;
    private String sobre_mi;
    private String edad;
    private String email;
    private String telefono;
    private String ubicacion;
    private String idioma;
    private String profile_image_url;

    
    public Persona() {
    }
    
    public Persona (Long id,
                    String nombre,
                    String redes_sociales,
                    String titulo,
                    String sobre_mi,
                    String edad,
                    String email,
                    String telefono,
                    String ubicacion,
                    String idioma,
                    String profile_image_url){
        this.id = id;
        this.nombre = nombre;
        this.profile_image_url = profile_image_url;
        this.redes_sociales = redes_sociales;
        this.titulo = titulo;
        this.sobre_mi = sobre_mi;
        this.edad = edad;
        this.email = email ;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.idioma = idioma ; 
    }
}
