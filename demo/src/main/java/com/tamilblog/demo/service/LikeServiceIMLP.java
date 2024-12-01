package com.tamilblog.demo.service;

import com.tamilblog.demo.DTO.LikesDTO;
import com.tamilblog.demo.entity.Likes;
import com.tamilblog.demo.userRepo.LikesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LikeServiceIMLP implements LikeService {

    @Autowired
    private LikesRepo likeRepo;

    @Override
    public List<LikesDTO> getAllLikes() {
        List<Likes> getLikes = likeRepo.findAll();
        List<LikesDTO> likeDTOList = new ArrayList<>();

        for (Likes a : getLikes) {
            LikesDTO likeDTO = new LikesDTO(
                    a.getLikeId(),
                    a.getPost().getPostId(),  // Accessing the postId from the Post object
                    a.getUser().getUserId()   // Accessing the userId from the User object
            );
            likeDTOList.add(likeDTO);
        }

        return likeDTOList;
    }

    @Override
    public LikesDTO addLike(int postId, int userId) {
        // Add logic to save the like to the database
        Likes like = new Likes();
        like.setPostId(postId);
        like.setUserId(userId);

        Likes savedLike = likeRepo.save(like);

        return new LikesDTO(savedLike.getLikeId(), savedLike.getPost().getPostId(), savedLike.getUser().getUserId());
    }

    @Override
    public void removeLike(int likeId) {
        likeRepo.deleteById(likeId);
    }
}
