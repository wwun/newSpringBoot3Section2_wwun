package com.william.curso.springboot.webapp.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.william.curso.springboot.webapp.springbootweb.models.User;

@RestController // con esto se dice que todo el controlador será del tipo rest, sino se puede
                // usar controller y cada método podría ser anotado con @ResponseBody
// @Controller
@RequestMapping("api")
public class UserRestController {

    @GetMapping("/details2")
    // @ResponseBody
    // @RequestMapping(path = "/details", method = RequestMethod.GET) //alternativa
    // a GetMapping
    public Map<String, Object> details() {
        User user = new User("William", "Wun");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Titulo");
        body.put("user", user);
        return body;
    }
}
