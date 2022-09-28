package com.SimplonMembers.response;

import com.SimplonMembers.entity.Post;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private Post post;
    private Boolean likedByAuthUser;
}
