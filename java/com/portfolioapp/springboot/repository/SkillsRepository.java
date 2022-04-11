package com.portfolioapp.springboot.repository;

import com.portfolioapp.springboot.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Long>{

}

