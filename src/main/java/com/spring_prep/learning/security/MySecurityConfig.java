package com.spring_prep.learning.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class MySecurityConfig {

//    @Bean
//    UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
//        UserDetails user = User.withUsername("tom").password(passwordEncoder().encode("cruise")).authorities("read").build();
//        inMemoryUserDetailsManager.createUser(user);
//        return inMemoryUserDetailsManager;
//    }

    @Bean
    BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic(Customizer.withDefaults());

//        httpSecurity.formLogin(Customizer.withDefaults());

//        httpSecurity.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated());

//        httpSecurity.authorizeHttpRequests(authorize -> authorize.requestMatchers("*").authenticated());
//
        httpSecurity.addFilterBefore(new MySecurityFilter(), BasicAuthenticationFilter.class);

        return httpSecurity.build();
    }

}
