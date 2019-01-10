package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {

    private User user;

    private UserRepository userRepository;

    private UserService userService;

    @Before
    public void init() {
        user = new User();
        user.setId(1);
        user.setFirstName("Bernadette");
        user.setName("Sanz");
    }

    @Test
    public void testUpdateName() {

    }

}
