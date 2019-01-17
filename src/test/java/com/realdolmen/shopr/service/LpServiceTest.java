package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.LpRepository;
import com.realdolmen.shopr.repository.OverviewRepository;
import com.realdolmen.shopr.repository.RatingRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LpServiceTest
{
    @InjectMocks
    LpService lpService;

    @Mock
    LpRepository lpRepository;
    @Mock
    RatingRepository ratingRepository;
    @Mock
    OverviewRepository overviewRepository;


    Lp lp;
    User user;
    Beoordeling beoordeling;
    List<Beoordeling> beoordelingList;

    @Before
    public void init()
    {
        lp = new Lp();
        lp.setId(1);
        lp.setTitel("meliora");
        lp.setUitvoerder("ghost");
        lp.setEnumMuziekGenre(EnumMuziekGenre.METAL);
        lp.setPrijs(20);
        lp.setLeverancier("records");
        lp.setType("lp");

        user = new User();
        user.setId(10);
        user.setName("meyers");
        user.setFirstName("indy");
        user.setRole(EnumRoles.USER);

        beoordeling = new Beoordeling();
        beoordeling.setScore(5);
        beoordeling.setOnschrijving("test");
        beoordeling.setUser(user);
        beoordeling.setArtikel(lp);

        beoordelingList = new ArrayList<>();
        Artikel artikel = new Artikel();
        artikel.setId(1);
        when(overviewRepository.findById(1)).thenReturn(artikel);
        when(ratingRepository.findBeoordelingenBepaaldArtikel(artikel.getId())).thenReturn(Arrays.asList(beoordeling, beoordeling));

    }

    @Test
    public void updateLpTest()
    {
        when(lpRepository.findById(1)).thenReturn(lp);
        lp.setTitel("opus");
        lp.setPrijs(30);
        lp.setEnumMuziekGenre(EnumMuziekGenre.ROCK);

        lpService.update(lp);
        assertEquals("opus", lp.getTitel());
        int prijs = lp.getPrijs();
        assertEquals(30, prijs);
        assertEquals(EnumMuziekGenre.ROCK, lp.getEnumMuziekGenre());
    }

    @Test
    public void insertLpTest()
    {
        doNothing().when(lpRepository).insert(lp);
        lpService.insert(lp);
        verify(lpRepository, times(1)).insert(lp);
    }

    @Ignore
    @Test
    public void deleteLpTest()
    {
        doNothing().when(lpRepository).delete(1);
        lpService.delete(1);
        verify(lpRepository, times(1)).delete(lp.getId());
        verify(lpRepository).delete(1);

    }

    @Test
    public void testFindById()
    {
        when(lpRepository.findById(1)).thenReturn(lp);
        Lp lptest = lpService.findLpById(1);
        assertEquals(lp, lptest);
    }

    @Test
    public void ratingOphalenPerLpTest()
    {
        lpService.ratingsOpHalenLp(1);
        assertFalse(lpService.getBeoordelingListLp().isEmpty());
        assertEquals("test", lpService.getBeoordelingListLp().get(0).getOnschrijving());
    }

}



