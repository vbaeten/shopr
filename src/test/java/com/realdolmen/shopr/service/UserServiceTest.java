package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.UserRepository;
import org.junit.Before;

public class UserServiceTest {
    private UserService userService;
    private User user;

    UserRepository userRepository;

    @Before
    public void init() {
        User user = new User();
        user.setName("De Clercq");
        user.setFirstName("Ellis");


    }


}
