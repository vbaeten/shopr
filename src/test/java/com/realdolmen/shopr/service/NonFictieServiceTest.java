package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.BoekRepository;
import com.realdolmen.shopr.repository.NonFictieRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class NonFictieServiceTest
{

    @InjectMocks
    NonFictieService nonFictieService;

    @InjectMocks
    BoekService boekService;

    @Mock
    BoekRepository boekRepository;

    @Mock
    NonFictieRepository nonFictieRepository;


    NonFictie nonFictie;
    Beoordeling beoordeling;
    User user;


    @Before
    public void init()
    {
        nonFictie = new NonFictie();
        nonFictie.setId(1);
        nonFictie.setTitel("titel");
        nonFictie.setLeverancier("leverancier");
        nonFictie.setAantalPaginas(200);
        nonFictie.setAuteur("auteur");
        nonFictie.setIsbn(" 978-2-7654-0912-0");
        nonFictie.setEnumNonFictieGenre(EnumNonFictieGenre.RELIGIE);

        user = new User();
        user.setId(10);
        user.setName("meyers");
        user.setFirstName("indy");
        user.setRole(EnumRoles.USER);
    }

    @Test
    public void updateNonFictieTest()
    {
        when(nonFictieRepository.findById(1)).thenReturn(nonFictie);
        nonFictie.setTitel("titel2");
        nonFictie.setLeverancier("leverancier2");
        nonFictie.setAantalPaginas(2000);
        nonFictie.setAuteur("auteur2");
        nonFictie.setIsbn("978-2-7654-0912-9");
        nonFictie.setEnumNonFictieGenre(EnumNonFictieGenre.KOOKBOEK);

        boekService.update(nonFictie);

        int aantal = nonFictie.getAantalPaginas();
        Assert.assertEquals(2000, aantal );
        Assert.assertEquals("titel2", nonFictie.getTitel() );
        Assert.assertEquals("auteur2", nonFictie.getAuteur() );
        Assert.assertEquals("978-2-7654-0912-9", nonFictie.getIsbn() );
        Assert.assertEquals("leverancier2", nonFictie.getLeverancier());
        Assert.assertEquals(EnumNonFictieGenre.KOOKBOEK, nonFictie.getEnumNonFictieGenre());
    }

    @Test
    public void insertFictieTest()
    {
        doNothing().when(nonFictieRepository).insert(nonFictie);
        nonFictieService.insert(nonFictie);
        verify(nonFictieRepository, times(1)).insert(nonFictie);
    }

    @Test
    public void testFindById()
    {
        when(nonFictieRepository.findById(1)).thenReturn(nonFictie);
        NonFictie nonfictietest = nonFictieService.findNonFictieById(1);
        Assert.assertEquals(nonFictie, nonfictietest);
    }


}
