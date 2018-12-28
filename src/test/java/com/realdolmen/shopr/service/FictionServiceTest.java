package com.realdolmen.shopr.service;

import com.realdolmen.shopr.repository.FictionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FictionServiceTest {

    @Mock
    private FictionRepository fictionRepository;

    @InjectMocks
    private FictionService fictionService;

    @Test
    public void TestFindAll() {

    }
}