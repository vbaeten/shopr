package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.EnumMuziekGenre;
import com.realdolmen.shopr.domain.EnumRoles;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.UserRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest
{
    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    User admin;
    User user;

    @Before
    public void init()
    {

        admin = new User();
        admin.setId(1);
        admin.setName("meyers");
        admin.setFirstName("koen");
        admin.setRole(EnumRoles.ADMIN);

        user = new User();
        user.setId(2);
        user.setName("meyers");
        user.setFirstName("indy");
        user.setRole(EnumRoles.USER);

    }

    @Test
    public void insertUserTest()
    {
        doNothing().when(userRepository).insert(user);
        userService.insert(user);
        verify(userRepository, times(1)).insert(user);
    }

    @Test
    public void insertAdminTest()
    {
        doNothing().when(userRepository).insert(admin);
        userService.insert(admin);
        verify(userRepository, times(1)).insert(admin);
    }

    @Ignore
    @Test
    public void deleteUserTest()
    {
        doNothing().when(userRepository).delete(admin);
        userService.delete(1);
        verify(this.userRepository).delete(admin);

    }

}
