package com.example.demo.control;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestControl {

    @Autowired
    UserService tbUserService;

    @GetMapping(value = "/test")
    public String getTest() throws Exception {
        return "hello test";
    }

}
