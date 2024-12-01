package com.tamilblog.demo.service;

import com.tamilblog.demo.DTO.PostDTO;
import com.tamilblog.demo.DTO.PostSaveDTO;

import java.util.List;

public interface PostService {
    List<PostDTO> getAllPosts();

    PostDTO getPostById(Integer postId);


    void addPost(PostSaveDTO postSaveDTO);

    boolean deletePost(int id);

}
