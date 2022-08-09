package com.example.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

        @GetMapping
        public String home() {
            return "<h3>Welcome to My website. Go to one of our web pages:</h3>" +
                    "<p>" +
                    "   <a href=\"/login\">Login Page" +
                    "</p>" +
                    "<p>" +
                    "   <a href=\"/logout\">Logout Page" +
                    "</p>" +
                    "<p>" +
                    "   <a href=\"/hello\">Hello User Page" +
                    "</p>" +
                    "<p>" +
                    "   <a href=\"/status\">Admins Only!" +
                    "</p>"
                    ;
        }
}
