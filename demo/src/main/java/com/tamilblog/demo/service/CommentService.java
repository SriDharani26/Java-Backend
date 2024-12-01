package com.tamilblog.demo.service;

import com.tamilblog.demo.DTO.CommentsDTO;
import java.util.List;

public interface CommentService {
    List<CommentsDTO> getAllComments();
    CommentsDTO addComment(int postId, int userId, String content);
    void removeComment(int commentId);
}
