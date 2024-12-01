package com.tamilblog.demo.DTO;

import java.time.LocalDateTime;

public class LikesDTO {
    private int likeId;            // Like ID
    private int userId;            // User ID who liked the post
    private int postId;            // Post ID that was liked
    private LocalDateTime createdAt; // Timestamp when the like occurred

    // Constructors
    public LikesDTO() {}

    public LikesDTO(int likeId, int userId, int postId, LocalDateTime createdAt) {
        this.likeId = likeId;
        this.userId = userId;
        this.postId = postId;
        this.createdAt = createdAt;
    }

    public LikesDTO(int likeId, int postId, int userId) {
        this.likeId = likeId;
        this.userId = userId;
        this.postId = postId;

    }

    // Getters and Setters
    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "LikesDTO{" +
                "likeId=" + likeId +
                ", userId=" + userId +
                ", postId=" + postId +
                ", createdAt=" + createdAt +
                '}';
    }
}
