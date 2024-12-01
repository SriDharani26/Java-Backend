package com.tamilblog.demo.userRepo;

import com.tamilblog.demo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface PostRepo extends JpaRepository <Post,Integer>{
    Optional<Post> findById(Integer postId);
}
