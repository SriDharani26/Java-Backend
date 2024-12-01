package com.tamilblog.demo.userController;

import com.tamilblog.demo.DTO.CommentsDTO;
import com.tamilblog.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/comments")
public class CommentsController {

    @Autowired
    private CommentService commentService;

    // Endpoint to get all comments for a specific post using postId
    @GetMapping("/getCommentsForPost/{postId}")
    public List<CommentsDTO> getCommentsForPost(@PathVariable int postId) {
        List<CommentsDTO> comments = commentService.getAllComments();
        // Filter the comments by postId
        return comments.stream()
                .filter(comment -> comment.getPostId() == postId)
                .toList();
    }

    // Add a comment to a specific post by a user (optional, if you need it)
    @PostMapping("/addComment")
    public CommentsDTO addComment(@RequestParam int postId, @RequestParam int userId, @RequestParam String content) {
        return commentService.addComment(postId, userId, content);
    }

    // Remove a comment from a specific post
    @DeleteMapping("/removeComment/{commentId}")
    public void removeComment(@PathVariable int commentId) {
        commentService.removeComment(commentId);
    }
}
