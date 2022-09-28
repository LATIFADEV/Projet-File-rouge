package com.SimplonMembers.mapper;

import com.SimplonMembers.dto.UpdateUserInfoDto;
import com.SimplonMembers.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    User userUpdateDtoToUser(UpdateUserInfoDto updateUserInfoDto);
}
