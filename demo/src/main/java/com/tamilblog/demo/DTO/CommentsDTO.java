package com.tamilblog.demo.DTO;

import java.time.LocalDateTime;

public class CommentsDTO {
    private int commentId;         // Comment ID
    private int userId;            // User ID who commented on the post
    private int postId;            // Post ID that was commented on
    private String content;        // Content of the comment
    private LocalDateTime createdAt; // Timestamp when the comment was posted

    // Constructors
    public CommentsDTO() {}

    public CommentsDTO(int commentId, int userId, int postId, String content, LocalDateTime createdAt) {
        this.commentId = commentId;
        this.userId = userId;
        this.postId = postId;
        this.content = content;
        this.createdAt = createdAt;
    }

    public CommentsDTO(int commentId, int postId, int userId, String content) {
        this.commentId = commentId;
        this.userId = userId;
        this.postId = postId;
        this.content = content;
    }

    // Getters and Setters
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "CommentsDTO{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", postId=" + postId +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
