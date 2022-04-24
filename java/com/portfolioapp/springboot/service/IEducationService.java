
package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Education;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Service
@Controller
public interface IEducationService {
    public List<Education> verEducation();
    public void crearEducation(Education exp);
    public void borrarEducation(Long id);

    
}
