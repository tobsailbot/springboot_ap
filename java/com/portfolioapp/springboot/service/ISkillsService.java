
package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Skills;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Service
@Controller
public interface ISkillsService {
    public List<Skills> verSkills();
    public void crearSkills(Skills per);
    public void borrarSkills(Long id);
    public Skills buscarSkills(Long id);

    public Skills findSkills(Long id);
    
    
}
