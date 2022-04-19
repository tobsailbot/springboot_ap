package com.portfolioapp.springboot.Controller;

import com.portfolioapp.springboot.model.Experience;
import com.portfolioapp.springboot.model.Persona;
import com.portfolioapp.springboot.model.Project;
import com.portfolioapp.springboot.model.Skills;
import com.portfolioapp.springboot.service.IExperienceService;
import com.portfolioapp.springboot.service.IPersonaService;
import com.portfolioapp.springboot.service.IProjectService;
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
    
 // ------------------------------------------------
  // ------------------------------------------------
   // ------------------------------------------------
    
    @Autowired
   private IProjectService projServ;
   
   @PostMapping ("/new/project")
   public void agregarProject (@RequestBody Project proj){
       projServ.crearProject(proj);
    }
    
    @GetMapping ("/ver/project")
    @ResponseBody
    public List <Project> verProject(){
        return projServ.verProject();
    }  
    
     @PutMapping("/editar/project/{id}")
    public Project editProject (@PathVariable Long id,
                                 @RequestBody Project proj   ){
        
        projServ.crearProject(proj); 
        return proj;               
    }
    
    @DeleteMapping("/delete/project/{id}")
    public Project borrarProject(@PathVariable Long id){
            projServ.borrarProject(id);
       return null;
    }
    
// ------------------------------------------------
 // ------------------------------------------------
   // ------------------------------------------------
    
    @Autowired
   private IExperienceService expServ;
   
   @PostMapping ("/new/exp")
   public void agregarExperience (@RequestBody Experience pers){
       expServ.crearExperience(pers);
   }
    
    @GetMapping ("/ver/exp")
    @ResponseBody
    public List <Experience> verExperience(){
        return expServ.verExperience();
    }  
   
    
    @DeleteMapping("/delete/exp/{id}")
    public Experience borrarExperience(@PathVariable Long id){
            expServ.borrarExperience(id);
       return null;
    }
    
 // ------------------------------------------------
  // ------------------------------------------------
   // ------------------------------------------------

    
    
    
}
