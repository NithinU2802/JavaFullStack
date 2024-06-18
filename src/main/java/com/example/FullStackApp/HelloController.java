package com.example.FullStackApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public  String hello(){
        return "Hello to my Java World";
    }
}
