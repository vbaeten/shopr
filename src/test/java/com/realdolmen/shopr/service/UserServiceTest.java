package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    List<User> userList;
    User user1;
    User user2;

    @Before
    public void init() {
        userList = new ArrayList<>();

        //  User 1
        user1 = new User();
        user1.setFirstName("Ellis");
        user1.setName("De Clercq");


        //  User 2
        user2 = new User();
        user2.setFirstName("Firstname");
        user2.setName("LastName");

        userList.add(user1);
        userList.add(user2);
    }

    @Test
    public void testUserRepositoryFindAll() {
        when(userRepository.findAll()).thenReturn(this.userList);
        assertEquals("size should be 2", 2, userList.size());
        assertEquals("First Name should be 'Ellis'", "Ellis", userList.get(0).getFirstName());
    }

    @Test
    public void testUserRepositoryRemove() {
        doNothing().when(userRepository).remove(user1);
        userRepository.remove(user1);
        verify(userRepository, times(1)).remove(user1);
    }

    @Test
    public void testUserRepositoryInsert() {
        when(userRepository.insert(user1)).thenReturn(user1);
        userService.insert(user1);
        verify(userRepository, times(1)).insert(user1);
    }

    @Test
    public void testUserRepositoryFindById() {
        Long primaryKey = 1L;
        when(userRepository.findByPrimaryKey(primaryKey)).thenReturn(user1);
        User userById = userService.findByPrimaryKey(primaryKey);
        assertEquals("userById is user1", user1, userById);
    }

    @Test
    public void testUserRepositoryUpdate() {
        when(userRepository.findByPrimaryKey(1L)).thenReturn(user1);
        userService.update(user1);
        verify(userRepository, times(1)).update(user1);
    }


}
