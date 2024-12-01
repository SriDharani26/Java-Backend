package com.tamilblog.demo.userController;

import com.tamilblog.demo.DTO.PostDTO;
import com.tamilblog.demo.DTO.PostSaveDTO;
import com.tamilblog.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/posts")

public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(path = "/getAllPosts")
    public List<PostDTO> getAllPosts() {
        List<PostDTO> allPosts = postService.getAllPosts();
        return allPosts;
    }

    @GetMapping(path = "/getOnePost/{postId}")
    public PostDTO getPostById(@PathVariable("postId") Integer postId) {
        return postService.getPostById(postId);
    }
    @PostMapping(path = "/addPost")
    public String addPost(@RequestBody PostSaveDTO postSaveDTO) {
        postService.addPost(postSaveDTO);
        return "Post added successfully!";
    }
    @DeleteMapping(path="/deletePost/{id}")
    public String deletePost(@PathVariable(value = "id") int id){
        boolean deletePost=postService.deletePost(id);
        return "deleted";
    }

}
