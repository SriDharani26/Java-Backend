package com.tamilblog.demo.entity;


import jakarta.persistence.*;
@Entity
@Table(name="userblog")
public class User {

    @Id
    @Column(name="user_id",length = 100)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name="user_name",length = 100)
    private String userName;

    @Column(name="user_blog_id",length = 100)
    private String userBlogId;

    @Column(name="user_pass",length = 12)
    private String userPassword;

    @Column(name="user_age",length = 10)
    private int userAge;

    public User(int userId, String userName, String userBlogId, String userPassword, int userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userBlogId = userBlogId;
        this.userPassword = userPassword;
        this.userAge = userAge;
    }

    public User() {
    }

    public User(String userName, String userBlogId, String userPassword, int userAge) {
        this.userName = userName;
        this.userBlogId = userBlogId;
        this.userPassword = userPassword;
        this.userAge = userAge;
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
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userID='" + userBlogId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userNumber=" + userAge+
                '}';
    }

}
