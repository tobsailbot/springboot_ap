
package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Experience;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Service
@Controller
public interface IExperienceService {
    public List<Experience> verExperience();
    public void crearExperience(Experience exp);
    public void borrarExperience(Long id);

    
}
