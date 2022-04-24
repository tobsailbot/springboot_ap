package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Experience;
import com.portfolioapp.springboot.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ExperienceService implements IExperienceService {
    
    
    @Autowired
    public ExperienceRepository expRepo;

    @Override
    public List<Experience> verExperience() {
       return expRepo.findAll();
    }

    @Override
    public void crearExperience(Experience exp) {
        expRepo.save(exp);
}

    @Override
    public void borrarExperience(Long id) {
        expRepo.deleteById(id);
    }


    
}
