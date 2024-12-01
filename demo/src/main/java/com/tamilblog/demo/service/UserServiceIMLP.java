package com.tamilblog.demo.service;

import com.tamilblog.demo.DTO.PostDTO;
import com.tamilblog.demo.DTO.UserDTO;
import com.tamilblog.demo.DTO.UserSaveDTO;
import com.tamilblog.demo.DTO.UserUpdateDTO;
import com.tamilblog.demo.entity.Post;
import com.tamilblog.demo.entity.User;
import com.tamilblog.demo.userRepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceIMLP implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public String addUser(UserSaveDTO userSaveDTO) {
        User user=new User(
                userSaveDTO.getUserName(),

                userSaveDTO.getUserBlogId(),
                userSaveDTO.getUserPassword(),
                userSaveDTO.getUserAge()
        );
        userRepo.save(user);
        return user.getUserName();

    }

    @Override
    public List<UserDTO> getAllUser() {
        List<User> getUsers=userRepo.findAll();
        List<UserDTO> userDTOList=new ArrayList<>();
        for(User a:getUsers){
            UserDTO userDTO=new UserDTO(
                    a.getUserId(),
                    a.getUserName(),
                    a.getUserBlogId(),
                    a.getUserPassword(),
                    a.getUserAge()
            );
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Override
    public String updateUser(UserUpdateDTO userUpdateDTO) {
        if(userRepo.existsById(userUpdateDTO.getUserId())){
            User user=userRepo.getById(userUpdateDTO.getUserId());

            user.setUserName(userUpdateDTO.getUserName());
            user.setUserBlogId(userUpdateDTO.getUserBlogId());
            user.setUserPassword(userUpdateDTO.getUserPassword());
            user.setUserAge(userUpdateDTO.getUserAge());

            userRepo.save(user);


        }
        else{
            System.out.println("User ID is not found");
        }

        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        if(userRepo.existsById(id)){

            userRepo.deleteById(id);
        }
        else{
            System.out.println("User ID is not found");

        }
        return true;

    }

    @Override
    public UserDTO getOneUser(String userBlogId, String userPassword) {

        User user = userRepo.findByUserBlogIdAndUserPassword(userBlogId, userPassword);
        return user != null ? new UserDTO(user) : null;
    }

    @Override
    public UserDTO getPostById(Integer userId) {
        Optional<User> user = userRepo.findById(userId);
        return new UserDTO(user.orElse(null));
    }

    @Override
    public UserDTO getOneBlogUser(String userBlogId) {
        User user = userRepo.findByUserBlogId(userBlogId);
        return user != null ? new UserDTO(user) : null;
    }
}
