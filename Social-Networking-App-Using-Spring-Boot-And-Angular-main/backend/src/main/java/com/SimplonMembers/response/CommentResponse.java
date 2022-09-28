package com.SimplonMembers.response;

import com.SimplonMembers.entity.Comment;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentResponse {
    private Comment comment;
    private Boolean likedByAuthUser;
}
