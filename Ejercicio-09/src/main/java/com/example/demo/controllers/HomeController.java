package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login(){
        return "index";
    }

    @GetMapping("/login/create")
    public String create(){
        return "register-v2";
    }

    @GetMapping("/login/forgot")
    public String forgot(){
        return "forgot";
    }
}
