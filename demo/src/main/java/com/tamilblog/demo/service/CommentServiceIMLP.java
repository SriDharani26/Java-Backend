package com.tamilblog.demo.service;

import com.tamilblog.demo.DTO.CommentsDTO;
import com.tamilblog.demo.entity.Comments;
import com.tamilblog.demo.userRepo.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentServiceIMLP implements CommentService {

    @Autowired
    private CommentsRepo commentRepo;

    @Override
    public List<CommentsDTO> getAllComments() {
        List<Comments> getComments = commentRepo.findAll();
        List<CommentsDTO> commentDTOList = new ArrayList<>();

        for (Comments a : getComments) {
            CommentsDTO commentDTO = new CommentsDTO(
                    a.getCommentId(),
                    a.getPost().getPostId(),  // Accessing the postId from the Post object
                    a.getUser().getUserId(),  // Accessing the userId from the User object
                    a.getContent()
            );
            commentDTOList.add(commentDTO);
        }

        return commentDTOList;
    }

    @Override
    public CommentsDTO addComment(int postId, int userId, String content) {

        Comments comment = new Comments();
        comment.setPostId(postId);
        comment.setUserId(userId);
        comment.setContent(content);

        Comments savedComment = commentRepo.save(comment);

        return new CommentsDTO(savedComment.getCommentId(), savedComment.getPost().getPostId(), savedComment.getUser().getUserId(), savedComment.getContent());
    }

    @Override
    public void removeComment(int commentId) {
        commentRepo.deleteById(commentId);
    }
}
