package com.SimplonMembers.mapper;

import com.SimplonMembers.dto.UpdateUserInfoDto;
import com.SimplonMembers.entity.User;
import com.SimplonMembers.entity.User.UserBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-27T07:59:34+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public User userUpdateDtoToUser(UpdateUserInfoDto updateUserInfoDto) {
        if ( updateUserInfoDto == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.firstName( updateUserInfoDto.getFirstName() );
        user.lastName( updateUserInfoDto.getLastName() );
        user.intro( updateUserInfoDto.getIntro() );
        user.gender( updateUserInfoDto.getGender() );
        user.hometown( updateUserInfoDto.getHometown() );
        user.currentCity( updateUserInfoDto.getCurrentCity() );
        user.eduInstitution( updateUserInfoDto.getEduInstitution() );
        user.workplace( updateUserInfoDto.getWorkplace() );
        user.birthDate( updateUserInfoDto.getBirthDate() );

        return user.build();
    }
}
