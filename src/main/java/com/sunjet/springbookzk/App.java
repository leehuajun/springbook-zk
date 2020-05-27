package com.sunjet.springbookzk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/mvvm")
    public String mvvm() {
        return "mvvm";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/navbar")
    public String navbar() {
        return "navbar";
    }
}