package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;
import com.realdolmen.shopr.repository.RatingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LpServiceTest {
    @InjectMocks
    LpService lpService;

    @Mock
    LpRepository lpRepository;

    @Mock
    RatingRepository ratingRepository;

    private Lp lp;

    @Before
    public void init(){
        lp = new Lp();
        lp.setId(1);
        lp.setArtist("TestArtist");
        lp.setTitle("TestTitle");
        lp.setPrice(9.99);
    }

    @Test
    public void testUpdateTitle(){
        when(lpRepository.findById(1)).thenReturn(lp);
        lpService.updateTitle(1, "TestTitle");
        Assert.assertEquals("TestTitle", lp.getTitle());
    }

    @Test
    public void testInsert(){
//        when(lpRepository.insert(any())).thenReturn(lp);
    }

//    @Test
//    public void testDelete(){
//        ArgumentCaptor<Lp> valueCapture = ArgumentCaptor.forClass(Lp.class);
//        doNothing().when(lpRepository).delete(valueCapture);
//        lpService.delete(lp);
//        verify(lpRepository, times(1)).delete(any());
//    }



}
