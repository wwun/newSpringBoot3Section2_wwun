package com.william.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({ "", "/", "/home" })
    public String home() {
        return "redirect:/details";
        // return "forward:/list"; // esto no reinicia el request y los datos que
        // estaban en la url original se
        // mantienen
    }
}
