package com.tron.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TronController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/characters")
    public String characters() {
        return "characters";
    }

    @GetMapping("/vehicles")
    public String vehicles() {
        return "vehicles";
    }

    @GetMapping("/quotes")
    public String quotes() {
        return "quotes";
    }
}
