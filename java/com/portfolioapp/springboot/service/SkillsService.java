package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Skills;
import com.portfolioapp.springboot.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class SkillsService implements ISkillsService {
    
    
    @Autowired
    public SkillsRepository skillsRepo;

    @Override
    public List<Skills> verSkills() {
       return skillsRepo.findAll();
    }

    @Override
    public void crearSkills(Skills ski) {
        skillsRepo.save(ski);
}

    @Override
    public void borrarSkills(Long id) {
        skillsRepo.deleteById(id);
    }


    
}
