package com.tamilblog.demo.userRepo;


import com.tamilblog.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    User findByUserBlogIdAndUserPassword(String userBlogId, String userPassword);

    User findByUserBlogId(String userBlogId);


}
