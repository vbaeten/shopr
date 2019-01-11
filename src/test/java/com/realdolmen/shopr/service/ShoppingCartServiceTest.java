package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.ShoppingCartRepository;
import com.realdolmen.shopr.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.inject.Inject;

@RunWith(MockitoJUnitRunner.class)
public class ShoppingCartServiceTest {

    @Mock
    private ShoppingCartRepository shoppingCartRepository;

    @InjectMocks
    private ShoppingCartService shoppingCartService;

    private User user;
    private ShoppingCart shoppingCart;

    @Before
    public void init() {
        user = new User();
        user.setId('1');
        user.setName("Seresia");
        user.setFirstName("Laura");
        shoppingCart = new ShoppingCart();
        shoppingCart.setId(5);
        shoppingCart.setUser(user);
    }

    @Test
    public void shoppingCartCanBeFoundByUser() {
        shoppingCartRepository.findByUser(user);
        Assert.assertEquals("Seresia", shoppingCart.getUser().getName());
    }

    @Test
    public void shoppingCartCanByFoundByUserId() {
        shoppingCartRepository.findByUserId(1);
        Assert.assertEquals("Seresia", shoppingCart.getUser().getName());
    }

    @Test
    public void newCartIsCreatedWhenUserHasNoShoppingCart() {
        shoppingCartRepository.findByUserId('1');
    }

}
