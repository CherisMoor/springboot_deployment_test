package com.win.practicingherokudeployment;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    public String sayHello(){
        return "hello world";
    }
}