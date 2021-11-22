package com.example.web.app.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("demo")
public class DemoController {
    
    @GetMapping(value="hello")
    public String HelloWorld() {
        return "Hello World";
    }
}
