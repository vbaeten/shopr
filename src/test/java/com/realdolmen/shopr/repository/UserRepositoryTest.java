package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.AbstractPersistenceTest;
import com.realdolmen.shopr.domain.User;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.PersistenceContext;

public class UserRepositoryTest extends AbstractPersistenceTest {

    private UserRepository userRepository;

    @Before
    public void initializeRepository() {
        userRepository = new UserRepository();
        userRepository.entityManager = entityManager;
    }

    @Test
    public void findUserById() throws Exception {
        User u = new User(1, "Seresia", "Laura");
        Assert.assertEquals("Laura", u.getFirstName());
    }
}
