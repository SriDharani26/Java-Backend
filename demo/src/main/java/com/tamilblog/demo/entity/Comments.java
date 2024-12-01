package com.tamilblog.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "postcomments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private int commentId;        // Comment ID

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private User user;            // The user who commented on the post

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "post_id", nullable = false)
    private Post post;            // The post that was commented on

    @Column(name = "content", nullable = false)
    private String content;       // Content of the comment

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt; // Timestamp when the comment was posted

    // Constructors
    public Comments() {}

    public Comments(int userId, Post post, String content) {
        this.user = new User();
        this.user.setUserId(userId);
        this.post = post;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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
        return "PostComments{" +
                "commentId=" + commentId +
                ", user=" + user.getUserName() +
                ", post=" + post.getTitleOfPost() +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public void setPostId(int postId) {
    }

    public void setUserId(int userId) {
    }
}
