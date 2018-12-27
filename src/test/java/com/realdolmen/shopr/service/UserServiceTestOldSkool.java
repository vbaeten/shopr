package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTestOldSkool {

    private User user;

    private UserRepository userRepository;

    private UserService userService;

    @Before
    public void init() {
        user = new User();
        user.setId(1L);
        user.setFirstName("John");
        user.setName("Doe");

        userRepository = new UserRepository(){
            public User findById(Long id) {
                return user;
            }
        };
        userService = new UserService();
        userService.setUserRepository(userRepository);
    }

    @Test
    public void testUpdateName() {
        userService.updateName(1L, "Van Cleemput");
        Assert.assertEquals("Van Cleemput", user.getName());
    }
}
