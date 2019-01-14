package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.BoekRepository;
import com.realdolmen.shopr.repository.FictieRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FictieServiceTest
{
    @InjectMocks
    FictieService fictieService;

    @Mock
    FictieRepository fictieRepository;

    @Mock
    BoekRepository boekRepository;

    Fictie fictie;
    Beoordeling beoordeling;
    User user;

    @Before
    public void init()
    {
        fictie = new Fictie();
        fictie.setId(1);
        fictie.setTitel("titel");
        fictie.setLeverancier("leverancier");
        fictie.setAantalPaginas(200);
        fictie.setAuteur("auteur");
        fictie.setKorteInhoud("korte inhoud");
        fictie.setIsbn(" 978-2-7654-0912-0");
        fictie.setEnumFictieGenre(EnumFictieGenre.SCIFI);

        user = new User();
        user.setId(10);
        user.setName("meyers");
        user.setFirstName("indy");
        user.setRole(EnumRoles.USER);

    }

    @Test
    public void updateFictieTest()
    {
        when(fictieRepository.findById(1)).thenReturn(fictie);
        fictie.setTitel("titel2");
        fictie.setLeverancier("leverancier2");
        fictie.setAantalPaginas(2000);
        fictie.setAuteur("auteur2");
        fictie.setKorteInhoud("korte inhoud2");
        fictie.setIsbn("978-2-7654-0912-9");
        fictie.setEnumFictieGenre(EnumFictieGenre.DETECTIVE);

        boekRepository.update(fictie);

        int aantal = fictie.getAantalPaginas();
        Assert.assertEquals(2000, aantal );
        Assert.assertEquals("titel2", fictie.getTitel() );
        Assert.assertEquals("auteur2", fictie.getAuteur() );
        Assert.assertEquals("978-2-7654-0912-9", fictie.getIsbn() );
        Assert.assertEquals("leverancier2", fictie.getLeverancier());
        Assert.assertEquals("korte inhoud2", fictie.getKorteInhoud());
        Assert.assertEquals(EnumFictieGenre.DETECTIVE, fictie.getEnumFictieGenre());
    }


    @Test
    public void insertFictieTest()
    {
        doNothing().when(fictieRepository).insert(fictie);
        fictieService.insert(fictie);
        verify(fictieRepository, times(1)).insert(fictie);
    }

    @Test
    public void testFindById()
    {
        when(fictieRepository.findById(1)).thenReturn(fictie);
        Fictie fictietest = fictieService.findFictieById(1);
        Assert.assertEquals(fictie, fictietest);
    }
}
