package com.tamilblog.demo.service;

import com.tamilblog.demo.DTO.PostDTO;
import com.tamilblog.demo.DTO.PostSaveDTO;
import com.tamilblog.demo.entity.Post;
import com.tamilblog.demo.userRepo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceIMLP implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Override
    public List<PostDTO> getAllPosts() {
        List<Post> getPosts = postRepo.findAll();
        List<PostDTO> postDTOList = new ArrayList<>();

        for (Post a : getPosts) {
            PostDTO postDTO = new PostDTO(
                    a.getPostId(),
                    a.getUser().getUserId(),
                    a.getTitleOfPost(),
                    a.getTypeOfPost(),
                    a.getContent()
            );
            postDTOList.add(postDTO);
        }

        return postDTOList;
    }

    @Override
    public PostDTO getPostById(Integer postId) {
        Optional<Post> post = postRepo.findById(postId);
        return new PostDTO(post.orElse(null));
    }


    @Override
    public void addPost(PostSaveDTO postSaveDTO) {
            Post post=new Post(
                    postSaveDTO.getUserId(),
                    postSaveDTO.getTitleOfPost(),
                    postSaveDTO.getTypeOfPost(),
                    postSaveDTO.getContent()
            );
            postRepo.save(post);


        }

    @Override
    public boolean deletePost(int id) {
        if(postRepo.existsById(id)){

            postRepo.deleteById(id);
        }
        else{
            System.out.println("User ID is not found");

        }
        return true;
    }
}



