package com.SimplonMembers.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SimplonMembers.entity.Comment;
import com.SimplonMembers.entity.Post;
import com.SimplonMembers.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    void deleteByEmail(String email);
    List<User> findUsersByFollowerUsers(User user, Pageable pageable);
    List<User> findUsersByFollowingUsers(User user, Pageable pageable);
    List<User> findUsersByLikedPosts(Post post, Pageable pageable);
    List<User> findUsersByLikedComments(Comment comment, Pageable pageable);

    @Query(value = "select * from users u " +
            "where concat(u.first_name, ' ', u.last_name) like %:name% " +
            "order by u.first_name asc, u.last_name asc",
           nativeQuery = true)
    List<User> findUsersByName(String name, Pageable pageable);
}
