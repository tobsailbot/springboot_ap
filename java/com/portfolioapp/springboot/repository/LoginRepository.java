package com.portfolioapp.springboot.repository;

import com.portfolioapp.springboot.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository <Login, Long>{

}

