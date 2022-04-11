package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Skills;
import com.portfolioapp.springboot.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class SkillsService implements ISkillsService {
    
    
    @Autowired
    public SkillsRepository persoRepo;

    @Override
    public List<Skills> verSkills() {
       return persoRepo.findAll();
    }

    @Override
    public void crearSkills(Skills ski) {
        persoRepo.save(ski);
}

    @Override
    public void borrarSkills(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return persoRepo.findById(id).orElse(null);
   }

    @Override
    public Skills findSkills(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
