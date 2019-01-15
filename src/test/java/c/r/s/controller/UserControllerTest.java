package c.r.s.controller;

import com.realdolmen.shopr.controller.UserController;
import com.realdolmen.shopr.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    private User ellis;
    private User nobody;

    UserController userController = new UserController();


    @Before
    public void init() {
        ellis = new User();
        ellis.setName("De Clercq");
        ellis.setFirstName("Ellis");
        ellis.setUserId(1L);

        nobody = new User();
        nobody.setName("Nobody");
        nobody.setFirstName("Really");

    }

    @Test
    public void sayHelloIfLoggedInUserExists() {
        String hallo = userController.sayHello(ellis);
        assertEquals("says hello to Ellis", " Hello Ellis", hallo);
    }

    @Test
    public void sayEmptyStringIfLoggedInUserDoesntExist() {
        String hallo = userController.sayHello(nobody);
        assertEquals("says nothing to nobody", "", hallo);
    }

}
