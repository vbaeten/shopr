package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserService {
    @Inject
    private UserRepository userRepository;

    public User findUserById(int id) {
        return userRepository.findById(id);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUserByName(String name) {
        return userRepository.findByName(name);
    }

    public void updateName(int id, String newName) {
        User user = userRepository.findById(id);
        user.setName(newName);
    }

    public void insert(User user) {
        userRepository.insert(user);
    }

    protected void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void update(User user){
        userRepository.update(user);
    }
}
