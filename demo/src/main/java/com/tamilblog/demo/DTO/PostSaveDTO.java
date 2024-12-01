package com.tamilblog.demo.DTO;


import java.util.List;

public class PostSaveDTO {
    private int userId;
    private String titleOfPost;
    private String typeOfPost;
    private String content;

    // Constructors
    public PostSaveDTO() {}

    public PostSaveDTO(int userId, String titleOfPost, String typeOfPost, String content) {
        this.userId = userId;
        this.titleOfPost = titleOfPost;
        this.typeOfPost = typeOfPost;
        this.content = content;

    }

    // Getters and Setters
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
                "userId=" + userId +
                ", titleOfPost='" + titleOfPost + '\'' +
                ", typeOfPost='" + typeOfPost + '\'' +
                ", content='" + content + '\'' +

                '}';
    }
}


