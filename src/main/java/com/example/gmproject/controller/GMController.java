package com.example.gmproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GMController {

    @GetMapping("/hello")
    public String hello() {
        return "index.html";
    }

}
