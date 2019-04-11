package com.dziesiedzieje.dziesiedzieje.controller;

import com.dziesiedzieje.dziesiedzieje.mapper.dto.UserDto;
import com.dziesiedzieje.dziesiedzieje.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<UserDto> getAllUsers() {
        userService.addDummyUser();
        return userService.findAllUsers();
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    UserDto getUserById(@PathVariable(value = "id") Long id) {
        return userService.findOneById(id);
    }

}