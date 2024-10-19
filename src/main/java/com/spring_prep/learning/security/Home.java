package com.spring_prep.learning.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/hello")
    public String getHome(){
        return "<h1> Welcome <h/1>";
    }

    @GetMapping("/bye")
    public String bye(){
        return "Get Lost!!";
    }
}
