package com.webapp.service.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {

    @GetMapping("/home")
    public String home() {
        return "Hello mundo modificado!";
    }

}
