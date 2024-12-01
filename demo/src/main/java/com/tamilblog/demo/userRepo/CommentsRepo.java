package com.tamilblog.demo.userRepo;

import com.tamilblog.demo.entity.Comments;
import com.tamilblog.demo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@EnableJpaRepositories
@Repository

public interface CommentsRepo extends JpaRepository<Comments,Integer> {
    List<Comments> findAll();

    Comments save(Comments comment);

    void deleteById(int commentId);
}
