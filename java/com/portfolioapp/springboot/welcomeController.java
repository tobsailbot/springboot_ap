package com.portfolioapp.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class welcomeController {

    @GetMapping("/hola")
    public String welcome() {
        return "Welcome to Spring Boot";
    }
}
