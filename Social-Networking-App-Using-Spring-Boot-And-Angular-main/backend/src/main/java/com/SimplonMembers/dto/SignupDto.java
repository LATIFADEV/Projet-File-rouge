package com.SimplonMembers.dto;

import lombok.*;

import javax.validation.constraints.Size;

import com.SimplonMembers.annotation.PasswordRepeatEqual;
import com.SimplonMembers.annotation.ValidEmail;
import com.SimplonMembers.annotation.ValidPassword;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@PasswordRepeatEqual(
        passwordFieldFirst = "password",
        passwordFieldSecond = "passwordRepeat"
)
public class SignupDto {
    @ValidEmail
    private String email;

    @ValidPassword
    private String password;
    private String passwordRepeat;

    private String firstName;

    private String lastName;
}
