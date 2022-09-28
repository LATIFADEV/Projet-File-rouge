package com.SimplonMembers.dto;

import com.SimplonMembers.annotation.PasswordRepeatEqual;
import com.SimplonMembers.annotation.ValidPassword;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@PasswordRepeatEqual(
        passwordFieldFirst = "password",
        passwordFieldSecond = "passwordRepeat"
)
public class UpdatePasswordDto {
    @ValidPassword
    private String password;
    private String passwordRepeat;
    private String oldPassword;
}
