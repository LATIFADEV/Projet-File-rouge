package com.SimplonMembers.mapper;

import com.SimplonMembers.dto.UpdateUserInfoDto;
import com.SimplonMembers.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-27T07:59:33+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class MapstructMapperUpdateImpl implements MapstructMapperUpdate {

    @Override
    public void updateUserFromUserUpdateDto(UpdateUserInfoDto updateUserInfoDto, User user) {
        if ( updateUserInfoDto == null ) {
            return;
        }

        user.setFirstName( updateUserInfoDto.getFirstName() );
        user.setLastName( updateUserInfoDto.getLastName() );
        user.setIntro( updateUserInfoDto.getIntro() );
        user.setGender( updateUserInfoDto.getGender() );
        user.setHometown( updateUserInfoDto.getHometown() );
        user.setCurrentCity( updateUserInfoDto.getCurrentCity() );
        user.setEduInstitution( updateUserInfoDto.getEduInstitution() );
        user.setWorkplace( updateUserInfoDto.getWorkplace() );
        user.setBirthDate( updateUserInfoDto.getBirthDate() );
    }
}
