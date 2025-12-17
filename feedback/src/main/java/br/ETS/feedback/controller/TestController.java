package br.ETS.feedback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Essa anotation serve para mostrar que é o controller de uma API rest
@RequestMapping("/test") // Essa anotation serve para mapear o endpoint das requisições
public class TestController {

    @GetMapping // Essa anotation define que o metodo vai ser do tipo GET
    public String hello(){
        return "Spring Boot Test - Ana";
    }
}
