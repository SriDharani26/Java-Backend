package com.tamilblog.demo.userRepo;

import com.tamilblog.demo.entity.Likes;
import com.tamilblog.demo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository

public interface LikesRepo extends JpaRepository<Likes,Integer> {
    List<Likes> findAll();

    Likes save(Likes like);

    void deleteById(int likeId);
}
