package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class indexController {
	@RequestMapping("/hi")
    public String hi() {
        return "hi";
    }
}
