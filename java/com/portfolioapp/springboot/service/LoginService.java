package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Login;
import com.portfolioapp.springboot.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class LoginService implements ILoginService {
    
    
    @Autowired
    public LoginRepository loginRepo;

    @Override
    public List<Login> verLogin() {
       return loginRepo.findAll();
    }

    @Override
    public void crearLogin(Login log) {
        loginRepo.save(log);
}

    @Override
    public void borrarLogin(Long id) {
        loginRepo.deleteById(id);
    }


    
}
