package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.domain.enums.LPMusicGenre;
import com.realdolmen.shopr.repository.LPRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class LpServiceTest {
    @Mock
    LPRepository lpRepository;

    @InjectMocks
    LPService lpService;

    List<LP> lpList;
    LP lp1;
    LP lp2;

    @Before
    public void init() {
        lpList = new ArrayList<>();

        //  LP 1
        lp1 = new LP();
        lp1.setTitle("testlp1");
        lp1.setPrice(BigDecimal.valueOf(20));
        lp1.setSupplierId("supplierid");
        lp1.setType("lp");
        lp1.setArtist("lpartist");
        lp1.setLPMusicGenre(LPMusicGenre.CLASSIC);

        //  Game 2
        lp2 = new LP();
        lp2.setTitle("testlp2");
        lp2.setPrice(BigDecimal.valueOf(11));
        lp2.setSupplierId("supplierid2");
        lp2.setType("lp");
        lp1.setArtist("lpartist");
        lp1.setLPMusicGenre(LPMusicGenre.CLASSIC);

        lpList.add(lp1);
        lpList.add(lp2);
    }

    @Test
    public void testGameRepositoryFindAll() {
        when(lpRepository.findAll()).thenReturn(this.lpList);
        assertEquals("size should be 2", 2, lpList.size());
        assertEquals("Title should be 'testlp1'", "testlp1", lpList.get(0).getTitle());
    }

    @Test
    public void testGameRepositoryRemove() {
        doNothing().when(lpRepository).remove(lp1);
        lpRepository.remove(lp1);
        verify(lpRepository, times(1)).remove(lp1);
    }

    @Test
    public void testGameRepositoryFindById() {
        Long primaryKey = 1L;
        when(lpRepository.findByPrimaryKey(primaryKey)).thenReturn(lp1);
        LP lpById = lpService.findByPrimaryKey(primaryKey);
        assertEquals("lpById is game1", lp1, lpById);
    }

    @Test
    public void testLPeRepositoryUpdate() {
        when(lpRepository.findByPrimaryKey(1L)).thenReturn(lp1);
        lpService.update(lp1);
        verify(lpRepository, times(1)).update(lp1);
    }
}