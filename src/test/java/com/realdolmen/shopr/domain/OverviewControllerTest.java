package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.controller.OverviewController;
import com.realdolmen.shopr.service.OverviewService;
import com.realdolmen.shopr.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OverviewControllerTest
{
    @InjectMocks
    OverviewController overviewController;

    @Mock
    OverviewService overviewService;

    @Mock
    UserService userService;


    Artikel artikelSelected;
    Lp lp;
    User user;

    @Before
    public void init()
    {
        user = new User();
        user.setId(10);
        user.setName("meyers");
        user.setFirstName("indy");
        user.setRole(EnumRoles.USER);

        artikelSelected = new Artikel();
        artikelSelected.setId(1);
        artikelSelected.setType("lp");
        artikelSelected.setPrijs(100);
        artikelSelected.setTitel("meliora");

        lp = new Lp();
        lp.setId(1);
        lp.setEnumMuziekGenre(EnumMuziekGenre.METAL);
        lp.setUitvoerder("ghost");

    }

    //
    //doNothing().when(orderRepository).insert(order);

    @Test
    public void testDetails()
    {
        //artikel dat binnenkomt ophalen uit db
        //favorieten ophalen van currentuser
//        Mockito.when(overviewService.findArtikelById(Mockito.anyInt())).thenReturn(this.artikelSelected);
//
//        overviewController.details(artikelSelected.getId(), user );
//
//        Assert.assertEquals();

    }


}
