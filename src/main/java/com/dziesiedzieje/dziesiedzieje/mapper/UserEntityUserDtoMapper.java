package com.dziesiedzieje.dziesiedzieje.mapper;

import com.dziesiedzieje.dziesiedzieje.entity.UserEntity;
import com.dziesiedzieje.dziesiedzieje.mapper.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserEntityUserDtoMapper {

    UserDto userEntityToUserDto(UserEntity userEntity);

    UserEntity userDtoToUserEntity(UserDto userDto);
}
