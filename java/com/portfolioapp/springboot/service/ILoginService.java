
package com.portfolioapp.springboot.service;

import com.portfolioapp.springboot.model.Login;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


@Service
@Controller
public interface ILoginService {
    public List<Login> verLogin();
    public void crearLogin(Login log);
    public void borrarLogin(Long id);

    
}
