package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.LpRepository;
import com.realdolmen.shopr.repository.OverviewRepository;
import com.realdolmen.shopr.repository.RatingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

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
    @InjectMocks
    RatingService ratingService;
    @Mock
    OverviewRepository overviewRepository;


    Lp lp;
    User user;
    Beoordeling beoordeling;

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

        ratingRepository = new RatingRepository();
        overviewRepository = new OverviewRepository();

//        beoordeling = new Beoordeling();
//        beoordeling.setScore(5);
//        beoordeling.setOnschrijving("test");
//        beoordeling.setUser(user);
//        beoordeling.setArtikel(lp);


    }

    @Test
    public void updateLpTest()
    {
        when(lpRepository.findById(1)).thenReturn(lp);
        lp.setTitel("opus");
        lp.setPrijs(30);
        lp.setEnumMuziekGenre(EnumMuziekGenre.ROCK);

        lpService.update(lp);
        Assert.assertEquals("opus", lp.getTitel());
        int prijs = lp.getPrijs();
        Assert.assertEquals(30, prijs);
        Assert.assertEquals(EnumMuziekGenre.ROCK, lp.getEnumMuziekGenre());
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
        Assert.assertEquals(lp, lptest);
    }

}


