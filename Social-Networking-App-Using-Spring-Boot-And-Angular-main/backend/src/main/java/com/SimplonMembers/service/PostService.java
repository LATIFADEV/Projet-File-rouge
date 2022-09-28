package com.SimplonMembers.service;

import com.SimplonMembers.dto.TagDto;
import com.SimplonMembers.entity.Comment;
import com.SimplonMembers.entity.Post;
import com.SimplonMembers.entity.Tag;
import com.SimplonMembers.entity.User;
import com.SimplonMembers.response.PostResponse;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {
    Post getPostById(Long postId);
    PostResponse getPostResponseById(Long postId);
    List<PostResponse> getPostsByUserPaginate(User author, Integer page, Integer size);
    List<PostResponse> getTimelinePostsPaginate(Integer page, Integer size);
    List<PostResponse> getPostSharesPaginate(Post sharedPost, Integer page, Integer size);
    List<PostResponse> getPostByTagPaginate(Tag tag, Integer page, Integer size);
    Post createNewPost(String content, MultipartFile postPhoto, List<TagDto> postTags);
    Post updatePost(Long postId, String content, MultipartFile postPhoto, List<TagDto> postTags);
    void deletePost(Long postId);
    void deletePostPhoto(Long postId);
    void likePost(Long postId);
    void unlikePost(Long postId);
    Comment createPostComment(Long postId, String content);
    Comment updatePostComment(Long commentId, Long postId, String content);
    void deletePostComment(Long commentId, Long postId);
    Post createPostShare(String content, Long postShareId);
    Post updatePostShare(String content, Long postShareId);
    void deletePostShare(Long postShareId);
}
