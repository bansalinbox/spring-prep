package com.spring_prep.learning.rough;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/api/foos")
    @ResponseBody
    public String getFoos(@RequestParam(name = "name", value = "World", required = false) String id) {
        return "ID: " + id;
    }
}
