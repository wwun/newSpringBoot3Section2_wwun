package com.william.curso.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.william.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("William", "Wun");
        model.addAttribute("title", "Nuevo curso");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {

        // model.addAttribute("users", users); //ahora se usará el método creado
        // userModel()
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel() {
        List<User> users = Arrays.asList(new User("pepa", "pig", "pepapig@company.com"),
                new User("lalo", "casa", "lalocasa@company.com"),
                new User("Jefferson", "Farfan"),
                new User("Andres", "Don"));
        return users;
    }
}
