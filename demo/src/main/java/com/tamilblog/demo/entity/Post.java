package com.tamilblog.demo.entity;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "userpost")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private int postId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private User user;  // Relationship to User (ManyToOne)

    @Column(name = "title_of_post", nullable = false, length = 255)
    private String titleOfPost;

    @Column(name = "type_of_post", nullable = false, length = 100)
    private String typeOfPost;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Likes> postLikes;  // OneToMany relationship with Likes

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comments> postComments;  // OneToMany relationship with Comments

    // Constructors
    public Post() {}

    public Post(int postId, User user, String titleOfPost, String typeOfPost, String content, LocalDateTime createdAt) {
        this.postId = postId;
        this.user = user;
        this.titleOfPost = titleOfPost;
        this.typeOfPost = typeOfPost;
        this.content = content;
        this.createdAt = createdAt;
    }

    public Post(User user, String titleOfPost, String typeOfPost, String content, LocalDateTime createdAt) {
        this.user = user;
        this.titleOfPost = titleOfPost;
        this.typeOfPost = typeOfPost;
        this.content = content;
        this.createdAt = createdAt;
    }

    public Post(int userId, String titleOfPost, String typeOfPost, String content) {
        this.user = new User();
        this.user.setUserId(userId);
        this.titleOfPost = titleOfPost;
        this.typeOfPost = typeOfPost;
        this.content = content;
        this.createdAt= LocalDateTime.now();
    }


    // Getters and Setters
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitleOfPost() {
        return titleOfPost;
    }

    public void setTitleOfPost(String titleOfPost) {
        this.titleOfPost = titleOfPost;
    }

    public String getTypeOfPost() {
        return typeOfPost;
    }

    public void setTypeOfPost(String typeOfPost) {
        this.typeOfPost = typeOfPost;
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

    public List<Likes> getPostLikes() {
        return postLikes;
    }

    public void setPostLikes(List<Likes> postLikes) {
        this.postLikes = postLikes;
    }

    public List<Comments> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<Comments> postComments) {
        this.postComments = postComments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", user=" + user.getUserName() +
                ", titleOfPost='" + titleOfPost + '\'' +
                ", typeOfPost='" + typeOfPost + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }


}
