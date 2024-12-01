package com.tamilblog.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "postlikes")
public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id")
    private int likeId;          // Like ID

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private User user;           // The user who liked the post

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "post_id", nullable = false)
    private Post post;           // The post that was liked

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;  // Timestamp when the like occurred

    // Constructors
    public Likes() {}

    public Likes(User user, Post post, LocalDateTime createdAt) {
        this.user = user;
        this.post = post;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Likes{" +
                "likeId=" + likeId +
                ", user=" + user.getUserName() +
                ", post=" + post.getTitleOfPost() +
                ", createdAt=" + createdAt +
                '}';
    }

    public void setPostId(int postId) {
        
    }

    public void setUserId(int userId) {
    }
}
