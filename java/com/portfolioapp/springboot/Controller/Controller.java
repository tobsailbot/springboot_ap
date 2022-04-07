package com.portfolioapp.springboot.Controller;

import com.portfolioapp.springboot.model.Persona;
import com.portfolioapp.springboot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin 
@Service
@RestController
public class Controller {
   
   @Autowired
   private IPersonaService persoServ;
   
   @PostMapping ("/new/persona")
   public void agregarPersona (@RequestBody Persona pers){
       persoServ.crearPersona(pers);
   }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List <Persona> verPersonas(){
        return persoServ.verPersonas();
    }  
   
    /*@PutMapping("/editar/persona/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido){
        
        Persona pers = persoServ.buscarPersona(id);
        pers.setApellido(nuevoApellido);
        pers.setNombre(nuevoNombre);
        
        persoServ.crearPersona(pers);
        return pers;
    
                                
                }*/
    
     @PutMapping("/editar/persona/{id}")
    public Persona editPersona2 (@PathVariable Long id,
                                  @RequestBody Persona nueva   ){
        
       /* Persona pers = persoServ.buscarPersona(id);
        pers.setApellido(nuevoApellido);
        pers.setNombre(nuevoNombre); */
        
        persoServ.crearPersona(nueva); 
        return nueva;
    
                                
                }

    
}
