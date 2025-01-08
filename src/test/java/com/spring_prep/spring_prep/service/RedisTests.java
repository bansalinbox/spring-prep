package com.spring_prep.spring_prep.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void testSendEmail(){
        //redisTemplate.opsForValue().set("email", "bansalinbox@gmail.com");
        Object name = redisTemplate.opsForValue().get("salary");
        Object email = redisTemplate.opsForValue().get("email");
        int a = 1;
    }
}
