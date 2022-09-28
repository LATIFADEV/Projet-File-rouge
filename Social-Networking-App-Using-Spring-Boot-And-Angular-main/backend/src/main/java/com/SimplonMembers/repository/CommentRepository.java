package com.SimplonMembers.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.SimplonMembers.entity.Comment;
import com.SimplonMembers.entity.Post;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post, Pageable pageable);
}
