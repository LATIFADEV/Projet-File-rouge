package com.SimplonMembers.dto;

import com.SimplonMembers.annotation.ValidEmail;
import com.SimplonMembers.annotation.ValidPassword;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    @ValidEmail
    private String email;

    @ValidPassword
    private String password;
}
