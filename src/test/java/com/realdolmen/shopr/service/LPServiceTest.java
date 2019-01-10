package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.LPRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LPServiceTest {

    private LP lp;
    private LP lp2;
    private List <LP> lps;


    @InjectMocks
    private LPService lpService;

    @Mock
    private LPRepository lpRepository;

    @Before
    public void init(){

    lp= new LP();
    lp2 = new LP();
    lps = new ArrayList<>();
    lps.add(lp);
    lps.add(lp2);
    }



    @Test
    public void shouldInsert() {

        lpService.insert(lp);
        verify(lpRepository,times(1)).insert(lp);

    }

    @Test
    public void findAllLps() {

        when(lpRepository.findAllLps()).thenReturn(lps);
        List<LP> resultList = lpService.findAllLps();
        assertEquals(resultList,lps);
        verify(lpRepository,times(1)).findAllLps();

    }

    @Test
    public void findById() {

        int id = lp.getId();
        when(lpRepository.findById(id)).thenReturn(lp);
        LP result = lpService.findById(id);
        assertEquals(result,lp);
        verify(lpRepository,times(1)).findById(id);
    }

    @Test
    public void delete() {

        lpService.delete(lp);
        verify(lpRepository,times(1)).delete(lp);
    }

    @Test
    public void update() {

        lpService.update(lp);
        verify(lpRepository,times(1)).update(lp);
    }
}