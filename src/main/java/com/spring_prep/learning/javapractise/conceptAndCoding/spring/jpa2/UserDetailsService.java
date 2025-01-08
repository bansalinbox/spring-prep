package com.spring_prep.learning.javapractise.conceptAndCoding.spring.jpa2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void saveUser(UserDetails user){
        userDetailsRepository.save(user);
    }

    public UserDetails findById(Long primaryKet){
        return userDetailsRepository.findById(primaryKet).get();
    }
}
