package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.persistence.EntityManager;

import static org.mockito.Mockito.when;

public class UserRepositoryTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private EntityManager em;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInsert() throws Exception {
        User user = new User("Doe", "John");
       // when(repository.insert(user)).thenReturn(null);

    }
}