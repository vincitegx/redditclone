package com.redditclone.repository;

import com.redditclone.model.Post;
import com.redditclone.model.Subreddit;
import com.redditclone.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(Users user);
}
