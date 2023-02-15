package com.redditclone.repository;

import com.redditclone.model.Comment;
import com.redditclone.model.Post;
import com.redditclone.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(Users user);
}
