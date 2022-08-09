package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloAPI") // How to use this... (will come up during Oauths)
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "targetName", defaultValue = "World") String name) {
        String apiExtension = "/helloAPI";
        return String.format("<h1>Hello User Web Page</h1>" +
                "<h3>A kind hello to %s, and to you a good day.</h3>" +
                        "<p><a href=\"/login\">Login Page</p>" +
                        "<p><a href=\"/logout\">Logout Page</p>" +
                        "<p><a href=\""+ apiExtension + "/status\">Admin-Only Status Page</p>"
                , name);
    }

    @GetMapping("/status")
    public String status() {
        String apiExtension = "/helloAPI";
        return "<h1>Congratulations</h1>" +
                "<h3>You must be an admin since you can see the application's status information</h3>" +
                "<p>" +
                "   <a href=\"/login\">Login Page" +
                "</p>" +
                "<p>" +
                "   <a href=\"/logout\">Logout Page" +
                "</p>" +
                "<p>" +
                "   <a href=\"" + apiExtension + "/hello\">Hello User Page" +
                "</p>";
    }
}
