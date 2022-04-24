package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Education;
import com.portfolioapp.springboot.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EducationService implements IEducationService {
    
    
    @Autowired
    public EducationRepository eduRepo;

    @Override
    public List<Education> verEducation() {
       return eduRepo.findAll();
    }

    @Override
    public void crearEducation(Education edu) {
        eduRepo.save(edu);
}

    @Override
    public void borrarEducation(Long id) {
        eduRepo.deleteById(id);
    }


    
}
