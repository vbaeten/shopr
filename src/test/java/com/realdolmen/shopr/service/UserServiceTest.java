package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    private User user;

    @Before
    public void init() {
        user = new User();
        user.setId(1);
        user.setFirstName("John");
        user.setName("Doe");
    }

    @Test
    public void testUpdateName() {
        when(userRepository.findById(1)).thenReturn(user);
        userService.updateName(1, "Van Cleemput");
        Assert.assertEquals("Van Cleemput", user.getName());
    }
}

