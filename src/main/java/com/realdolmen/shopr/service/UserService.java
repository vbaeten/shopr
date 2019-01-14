package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.CrudRepository;
import com.realdolmen.shopr.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserService extends CrudService<User, Long> {
    @Inject
    private UserRepository userRepository;

    @Override
    CrudRepository<User, Long> getRepository() {
        return userRepository;
    }

//    public User findUserByUserId(Long userId) {
//        return userRepository.findByPrimaryKey(userId);
//    }
//
//    public List<User> findAllUsers() {
//        return userRepository.findAll();
//    }
//
//    public User findUserByName(String name) {
//        return userRepository.findByName(name);
//    }
//
//    public void updateName(Long userId, String newName) {
//        User user = userRepository.findByPrimaryKey(userId);
//        user.setName(newName);
//    }
//
//    public void insert(User user) {
//        userRepository.insert(user);
//    }
//
//    public void removeUserByUserId(Long userId) {
//        userRepository.removeUserByUserId(userId);
//    }

}
