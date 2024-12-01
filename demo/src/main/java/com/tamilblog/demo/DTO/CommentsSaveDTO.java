package com.tamilblog.demo.DTO;

import java.time.LocalDateTime;

public class CommentsSaveDTO {
             // Comment ID
    private int userId;            // User ID who commented on the post
    private int postId;            // Post ID that was commented on
    private String content;        // Content of the comment
     // Timestamp when the comment was posted

    // Constructors
    public CommentsSaveDTO() {}

    public CommentsSaveDTO( int userId, int postId, String content) {
        this.userId = userId;
        this.postId = postId;
        this.content = content;

    }



    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "CommentsDTO{" +
                ", userId=" + userId +
                ", postId=" + postId +
                ", content='" + content + '\'' +

                '}';
    }
}
