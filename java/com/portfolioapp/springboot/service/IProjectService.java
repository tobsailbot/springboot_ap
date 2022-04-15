package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Project;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Service
@Controller
public interface IProjectService {
    public List<Project> verProject();
    public void crearProject(Project proj);
    public void borrarProject(Long id);

    
    
}
