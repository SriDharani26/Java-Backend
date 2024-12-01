package com.tamilblog.demo.DTO;

public class UserUpdateDTO {
    private int userId;
    private String userName;
    private String userBlogId;
    private String userPassword;
    private int userAge;

    public UserUpdateDTO(int userId, String userName, String userBlogId, String userPassword, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userBlogId = userBlogId;
        this.userPassword = userPassword;
        this.userAge = userAge;
    }

    public UserUpdateDTO() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBlogId() {
        return userBlogId;
    }

    public void setUserBlogId(String userBlogId) {
        this.userBlogId = userBlogId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "userDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userBlogId='" + userBlogId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}

