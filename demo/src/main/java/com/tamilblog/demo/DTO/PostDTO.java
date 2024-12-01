package com.tamilblog.demo.DTO;

import com.tamilblog.demo.entity.Post;

public class PostDTO {
    private int postId;          // Post ID
    private int userId;          // User ID
    private String titleOfPost;  // Title of the post
    private String typeOfPost;   // Type of post (e.g., blog, article, etc.)
    private String content;      // Content of the post
      // List of tags

    // Constructors
    public PostDTO(Post post) {
        this.postId=post.getPostId();
        this.userId=post.getUser().getUserId();
        this.typeOfPost=post.getTypeOfPost();
        this.titleOfPost=post.getTitleOfPost();
        this.content=post.getContent();
    }

    public PostDTO(int postId, int userId, String titleOfPost, String typeOfPost, String content) {
        this.postId = postId;
        this.userId = userId;
        this.titleOfPost = titleOfPost;
        this.typeOfPost = typeOfPost;
        this.content = content;

    }





    // Getters and Setters
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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



    @Override
    public String toString() {
        return "PostDTO{" +
                "postId=" + postId +
                ", userId=" + userId +
                ", titleOfPost='" + titleOfPost + '\'' +
                ", typeOfPost='" + typeOfPost + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}


