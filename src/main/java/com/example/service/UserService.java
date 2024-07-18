package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public User getUser(long userId);

    public void createUser(User user);

    public User updateUser(User user);

    public void deleteUser(long id);
}
