package com.tamilblog.demo.DTO;

public class UserSaveDTO {


    private String userName;
    private String userBlogId;
    private String userPassword;
    private int userAge;

    public UserSaveDTO( String userName, String userBlogId, String userPassword, int userAge) {

        this.userName = userName;
        this.userBlogId = userBlogId;
        this.userPassword = userPassword;
        this.userAge = userAge;
    }

    public UserSaveDTO() {
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
                ", userName='" + userName + '\'' +
                ", userBlogId='" + userBlogId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
