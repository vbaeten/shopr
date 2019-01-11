package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.controller.LoginController;
import com.realdolmen.shopr.controller.UserController;
import com.realdolmen.shopr.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest
{
    @InjectMocks
    UserController userController;

    @Mock
    UserService userService;

    @InjectMocks
    LoginController loginController;

    User user;
    User currentUser;
    String currentUserName;
    EnumRoles enumRoles;
    List<Artikel> favorieten;

    @Before
    public void init()
    {

//        currentUser = new User();
        user = new User();
        user.setId(10);
        user.setName("meyers");
        user.setFirstName("indy");
        user.setRole(EnumRoles.USER);


    }

    @Test
    public void testLoggedIn()
    {
        Mockito.when(userService.findUserById(Mockito.anyInt())).thenReturn(this.user);

        loginController.loggedIn();

        Assert.assertNotNull(loginController.getCurrentUser());
        Assert.assertEquals(loginController.getCurrentUser().getRole(), EnumRoles.USER);
        Assert.assertEquals(loginController.getCurrentUser().getName(), "meyers");
    }

    @Test
    public void testSetCurrentUserName() {
        Mockito.when(userService.findUserById(Mockito.anyInt())).thenReturn(this.user);

        loginController.loggedIn();
        loginController.setCurrentUserName("Test");

        Assert.assertNotEquals(loginController.getCurrentUserName(), "meyers");
        Assert.assertEquals(loginController.getCurrentUserName(), "Test");

    }
}
