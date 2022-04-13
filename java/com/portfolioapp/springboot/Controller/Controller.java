package com.portfolioapp.springboot.Controller;

import com.portfolioapp.springboot.model.Persona;
import com.portfolioapp.springboot.model.Skills;
import com.portfolioapp.springboot.service.IPersonaService;
import com.portfolioapp.springboot.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
   
    
     @PutMapping("/editar/persona/{id}")
    public Persona editPersona2 (@PathVariable Long id,
                                 @RequestBody Persona nueva   ){
        
        persoServ.crearPersona(nueva); 
        return nueva;               
                }
    
// ------------------------------------------------
 // ------------------------------------------------
   // ------------------------------------------------
    
    @Autowired
   private ISkillsService skillServ;
   
   @PostMapping ("/new/skill")
   public void agregarSkills (@RequestBody Skills pers){
       skillServ.crearSkills(pers);
   }
    
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List <Skills> verSkills(){
        return skillServ.verSkills();
    }  
   
    
     @PutMapping("/editar/skill/{id}")
    public Skills editSkills (@PathVariable Long id,
                                 @RequestBody Skills nueva   ){
        
        skillServ.crearSkills(nueva); 
        return nueva;               
                }
    @DeleteMapping("/delete/skill/{id}")
    public Skills borrarSkills(@PathVariable Long id){
            skillServ.borrarSkills(id);
       return null;
    }
    
    
    
}
