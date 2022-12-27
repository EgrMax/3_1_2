package ru.itmentor.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String MainPage() {
        return "redirect:/login";
    }

    @GetMapping("/auth")
    public String auth() {
        return "index";
    }
}
