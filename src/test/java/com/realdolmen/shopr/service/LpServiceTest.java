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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
        lpService.updateTitle(1, "NewTestTitle");
        Assert.assertEquals("NewTestTitle", lp.getTitle());
    }

    @Test
    public void testInsert(){
        doNothing().when(lpRepository).insert(lp);
        lpService.insert(lp);
        verify(lpRepository, times(1)).insert(lp);
    }

    @Test
    public void testDelete(){
        doNothing().when(lpRepository).delete(1);
        lpService.delete(lp);
        verify(lpRepository, times(1)).delete(1);
    }

    @Test
    public void testFindLpById(){
        when(lpRepository.findById(1)).thenReturn(lp);
        Lp checkedLp = lpService.findLpById(1);
        assertEquals(checkedLp, lp);
    }

    @Test
    public void testUpdate(){
        when(lpRepository.findById(1)).thenReturn(lp);
        lpService.update(lp);
        verify(lpRepository, times(1)).update(lp);
    }



}
