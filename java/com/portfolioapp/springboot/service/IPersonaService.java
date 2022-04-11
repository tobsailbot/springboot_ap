
package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Persona;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Service
@Controller
public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);

    public Persona findPersona(Long id);
    
    
}
