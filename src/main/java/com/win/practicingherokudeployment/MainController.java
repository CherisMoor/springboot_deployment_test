package com.win.practicingherokudeployment;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {
    
    @GetMapping("/")
    public String sayHello(){
        return "hello world";
    }
}