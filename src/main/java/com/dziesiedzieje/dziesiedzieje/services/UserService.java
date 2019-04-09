package com.dziesiedzieje.dziesiedzieje.services;


import com.dziesiedzieje.dziesiedzieje.mapper.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAllUsers();

    void addDummyUser();
}
