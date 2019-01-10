package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserService {
    @Inject
    private UserRepository userRepository;

    public User findUserByUserId(int userId) {
        return userRepository.findByUserId(userId);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserByName(String name) {
        return userRepository.findByName(name);
    }

    public void updateName(int userId, String newName) {
        User user = userRepository.findByUserId(userId);
        user.setName(newName);
    }

    public void insert(User user) {
        userRepository.insert(user);
    }

    public void removeUserByUserId(int userId) {
        userRepository.removeUserByUserId(userId);
    }

}
