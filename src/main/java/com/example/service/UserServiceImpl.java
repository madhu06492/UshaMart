package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(long userId) {
        try{
        return userRepo.findById(userId).get();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createUser(User user) {
        userRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepo.delete(userRepo.findById(id).get());
    }
}
