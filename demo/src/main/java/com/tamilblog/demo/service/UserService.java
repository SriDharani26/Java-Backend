package com.tamilblog.demo.service;

import com.tamilblog.demo.DTO.UserDTO;
import com.tamilblog.demo.DTO.UserSaveDTO;
import com.tamilblog.demo.DTO.UserUpdateDTO;

import java.util.List;

public interface UserService {
    String addUser(UserSaveDTO userSaveDTO);

    List<UserDTO> getAllUser();

    String updateUser(UserUpdateDTO userUpdateDTO);

    boolean deleteUser(int id);

    UserDTO getOneUser(String userBlogId, String userPassword);

    UserDTO getPostById(Integer userId);

    UserDTO getOneBlogUser(String userBlogId);
}
