package com.tamilblog.demo.userController;


import com.tamilblog.demo.DTO.PostDTO;
import com.tamilblog.demo.DTO.UserDTO;
import com.tamilblog.demo.DTO.UserSaveDTO;
import com.tamilblog.demo.DTO.UserUpdateDTO;
import com.tamilblog.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/users")
public class userController {
    @Autowired
    private UserService userService;

    @PostMapping(path="/save")
    public String saveUser(@RequestBody UserSaveDTO userSaveDTO){
        String id=userService.addUser(userSaveDTO);
        return id;
    }

    @GetMapping(path="/getAllUser")
    public List<UserDTO> getAllUser(){
        List<UserDTO> allUsers=userService.getAllUser();
        return allUsers;
    }

    @PostMapping(path="/update")
    public String updateUser(@RequestBody UserUpdateDTO userUpdateDTO){
        String id=userService.updateUser(userUpdateDTO);
        return id;
    }

    @DeleteMapping(path="/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") int id){
        boolean deleteUser=userService.deleteUser(id);
        return "deleted";
    }

    @GetMapping(path="/getOneUser")
    public UserDTO getOneUser(@RequestParam String userBlogId, @RequestParam String userPassword) {
        UserDTO oneUser = userService.getOneUser(userBlogId, userPassword);
        return oneUser;
    }

    @GetMapping(path="/getOneBlogUser")
    public UserDTO getOneBlogUser(@RequestParam String userBlogId) {
        UserDTO oneUser = userService.getOneBlogUser(userBlogId);
        return oneUser;
    }
    @GetMapping(path = "/getOneUser/{userId}")
    public UserDTO getPostById(@PathVariable("userId") Integer userId) {
        return userService.getPostById(userId);
    }
    
}
