package com.SimplonMembers.response;

import com.SimplonMembers.entity.User;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private User user;
    private Boolean followedByAuthUser;
}
