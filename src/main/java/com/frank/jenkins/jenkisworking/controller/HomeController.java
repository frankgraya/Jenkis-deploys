package com.frank.jenkins.jenkisworking.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "¡Hola Mundo con Spring Boot, Thymeleaf y Bootstrap!");
        return "index";
    }
}
