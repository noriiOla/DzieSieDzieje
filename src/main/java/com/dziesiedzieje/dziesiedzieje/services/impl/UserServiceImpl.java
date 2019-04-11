package com.dziesiedzieje.dziesiedzieje.services.impl;

import com.dziesiedzieje.dziesiedzieje.entity.AuthProvider;
import com.dziesiedzieje.dziesiedzieje.entity.UserEntity;
import com.dziesiedzieje.dziesiedzieje.entity.UserRole;
import com.dziesiedzieje.dziesiedzieje.mapper.UserEntityUserDtoMapper;
import com.dziesiedzieje.dziesiedzieje.mapper.dto.UserDto;
import com.dziesiedzieje.dziesiedzieje.repository.UserRepository;
import com.dziesiedzieje.dziesiedzieje.services.UserService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    private UserEntityUserDtoMapper mapper
            = Mappers.getMapper(UserEntityUserDtoMapper.class);

    @Override
    public List<UserDto> findAllUsers() {
        return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .map(userEntity -> mapper.userEntityToUserDto(userEntity))
                .collect(Collectors.toList());
    }

    @Override
    public void addDummyUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("Wlodi");
        userEntity.setSurname("Best");
        userEntity.setEmail("wlodi@gamil.com");
        userEntity.setPassword("admin");
        userEntity.setProvider(AuthProvider.local);
        userEntity.setUserRole(UserRole.user);
        userRepository.save(userEntity);
    }

    @Override
    public UserDto findOneById(Long id) {
        return mapper.userEntityToUserDto(userRepository.findOneById(id));
    }
}
