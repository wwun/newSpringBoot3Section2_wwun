package com.william.curso.springboot.webapp.springbootweb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.william.curso.springboot.webapp.springbootweb.models.User;
import com.william.curso.springboot.webapp.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;

@RestController // con esto se dice que todo el controlador será del tipo rest, sino se puede
                // usar controller y cada método podría ser anotado con @ResponseBody
// @Controller
@RequestMapping("api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("William", "Wun");
        userDto.setUser(user);
        userDto.setTitle("Hola");
        return userDto;
    }

    @GetMapping("list")
    public List<User> list() {
        User user = new User("William", "Wun");
        User user2 = new User("Andres", "Guzman");
        User user3 = new User("Otro", "Nombre");

        List<User> users = Arrays.asList(user, user2, user3);
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    @GetMapping("/details-map")
    // @ResponseBody //se usa cuando se ha anotado con Controller
    // @RequestMapping(path = "/details", method = RequestMethod.GET) //alternativa
    // a GetMapping
    public Map<String, Object> detailsMap() {
        User user = new User("William", "Wun");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Titulo");
        body.put("user", user);
        return body;
    }
}
