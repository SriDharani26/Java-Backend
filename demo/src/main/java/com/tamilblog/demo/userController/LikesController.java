package com.tamilblog.demo.userController;

import com.tamilblog.demo.DTO.LikesDTO;
import com.tamilblog.demo.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/likes")
public class LikesController {

    @Autowired
    private LikeService likeService;

    // Endpoint to get all likes for a specific post using postId
    @GetMapping("/getLikesForPost/{postId}")
    public int getLikesForPost(@PathVariable int postId) {
        List<LikesDTO> likes = likeService.getAllLikes();
        // Filter the likes by postId and return the count
        long likeCount = likes.stream()
                .filter(like -> like.getPostId() == postId)
                .count();
        return (int) likeCount;
    }

    // Add a like to a specific post by a user (optional, if you need it)
    @PostMapping("/addLike")
    public LikesDTO addLike(@RequestParam int postId, @RequestParam int userId) {
        return likeService.addLike(postId, userId);
    }

    // Remove a like from a specific post
    @DeleteMapping("/removeLike/{likeId}")
    public void removeLike(@PathVariable int likeId) {
        likeService.removeLike(likeId);
    }
}
