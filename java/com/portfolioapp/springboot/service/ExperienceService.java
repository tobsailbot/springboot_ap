package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Experience;
import com.portfolioapp.springboot.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ExperienceService implements IExperienceService {
    
    
    @Autowired
    public ExperienceRepository persoRepo;

    @Override
    public List<Experience> verExperience() {
       return persoRepo.findAll();
    }

    @Override
    public void crearExperience(Experience exp) {
        persoRepo.save(exp);
}

    @Override
    public void borrarExperience(Long id) {
        persoRepo.deleteById(id);
    }


    
}
