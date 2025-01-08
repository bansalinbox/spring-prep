package com.spring_prep.learning.javapractise.conceptAndCoding.spring.jpa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user/")
public class UserDetailsController {

    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping(path = "/user-details")
    public UserDetails getUserDetails(){

        UserDetails user1= UserDetails.builder().name("gourav").email("gourav@gmail.com").build();
        userDetailsService.saveUser(user1);

        return userDetailsService.findById(1L);
    }
}
