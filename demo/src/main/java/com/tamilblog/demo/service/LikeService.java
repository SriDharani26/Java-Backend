package com.tamilblog.demo.service;

import com.tamilblog.demo.DTO.LikesDTO;
import java.util.List;

public interface LikeService {
    List<LikesDTO> getAllLikes();
    LikesDTO addLike(int postId, int userId);
    void removeLike(int likeId);
}
