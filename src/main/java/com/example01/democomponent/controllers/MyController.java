package com.example01.democomponent.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String sayHi() {
        return "hi, nicd to meet you";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
