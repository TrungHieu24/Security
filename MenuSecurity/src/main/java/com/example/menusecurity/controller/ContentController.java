package com.example.menusecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ContentController {
    @GetMapping("/login")
    public String handleLogin() {
        return "menu/custom_login";
    }
}
