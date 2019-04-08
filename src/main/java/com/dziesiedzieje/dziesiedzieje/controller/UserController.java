package com.dziesiedzieje.dziesiedzieje.controller;

import com.dziesiedzieje.dziesiedzieje.entity.AuthProvider;
import com.dziesiedzieje.dziesiedzieje.entity.UserEntity;
import com.dziesiedzieje.dziesiedzieje.entity.UserRole;
import com.dziesiedzieje.dziesiedzieje.mapper.dto.UserDto;
import com.dziesiedzieje.dziesiedzieje.repository.UserRepository;
import com.dziesiedzieje.dziesiedzieje.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<UserDto> getAllUsers() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("Wlodi");
        userEntity.setSurname("Best");
        userEntity.setEmail("wlodi@gamil.com");
        userEntity.setPassword("admin");
        userEntity.setProvider(AuthProvider.local);
        userEntity.setUserRole(UserRole.user);
        userRepository.save(userEntity);
        return userService.findAllUsers();
    }

}