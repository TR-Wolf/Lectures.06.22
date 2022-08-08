package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "targetName", defaultValue = "World") String name) {
        return String.format("Hello %s", name);
    }

    @GetMapping("/status")
    public String status() {
        return "Congratulations - you must be an admin since you can see the application's status information";
    }
}
