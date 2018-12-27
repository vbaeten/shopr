package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LpServiceTest {
    @InjectMocks
    LpService lpService;

    @Mock
    LpRepository lpRepository;

    private Lp lp;

    @Before
    public void init(){
        lp = new Lp();
        lp.setId(1);
        lp.setArtist("Testartist");
        lp.setTitle("TestTitle");
        lp.setPrice(9.99);
    }

    @Test
    public void testUpdateTitle(){
        when(lpRepository.findById(1)).thenReturn(lp);
        lpService.updateTitle(1, "TestTitle");
        Assert.assertEquals("TestTitle", lp.getTitle());
    }

}
