package com.example.controller;

import com.example.Response;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping("/users")
    public Response<List<User>> getUsers() {
        List<User> list= userService.getUsers();
        if(list.size()<=0){
            return new Response(404,"List Customer is Empty",list);
        }
        return new Response(200,"Success",list);
    }

    @GetMapping("/user/{userId}")
    public Response<User> getUser(@PathVariable long userId) {
        User user = userService.getUser(userId);
        if(user ==null){
            return new Response(404,"empty", user);
        }
        return new Response(200,"", user);
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable long userId) {
        userService.deleteUser(userId);
    }
}
