package com.tiptop.extws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HomeController {

    @GetMapping
    public String helloWorld(){
        return "Hello world :)";
    }
}
