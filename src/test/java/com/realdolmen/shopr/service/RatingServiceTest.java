package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.RatingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RatingServiceTest
{
    @InjectMocks
    RatingService ratingService;

    @Mock
    RatingRepository ratingRepository;

    User user;
    Beoordeling beoordeling;
    Lp lp;

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
        beoordeling.setArtikel(lp);
        beoordeling.setUser(user);
        beoordeling.setOnschrijving("test");
        beoordeling.setScore(5);
    }

    @Test
    public void insertBeoordelingTest()
    {
        doNothing().when(ratingRepository).insert(beoordeling);
        ratingService.insert(beoordeling);
        verify(ratingRepository, times(1)).insert(beoordeling);
    }



}
