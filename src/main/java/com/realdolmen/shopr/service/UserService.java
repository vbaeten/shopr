package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.CrudRepository;
import com.realdolmen.shopr.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserService extends CrudService<User, Long> {
    @Inject
    private UserRepository userRepository;

    @Override
    CrudRepository<User, Long> getRepository() {
        return userRepository;
    }
}
