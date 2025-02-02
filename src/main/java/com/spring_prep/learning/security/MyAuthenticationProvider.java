package com.spring_prep.learning.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//public class MyAuthenticationProvider{
public class MyAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String userName = authentication.getName();
        String password = authentication.getCredentials().toString();
        if("tom".equals(userName) && "cruise".equals(password)){
            return new UsernamePasswordAuthenticationToken(userName, password, Arrays.asList());
        }else{
            throw new BadCredentialsException("Invalid User name or password");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
