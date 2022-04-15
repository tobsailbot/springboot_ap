package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Project;
import com.portfolioapp.springboot.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProjectService implements IProjectService {
    
    
    @Autowired
    public ProjectRepository persoRepo;

    @Override
    public List<Project> verProject() {
       return persoRepo.findAll();
    }

    @Override
    public void crearProject(Project proj) {
        persoRepo.save(proj);
    }

    @Override
    public void borrarProject(Long id) {
        persoRepo.deleteById(id);
    }

    
}
