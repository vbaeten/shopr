package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.controller.WinkelmandjeController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.CoreMatchers.is;

@RunWith(MockitoJUnitRunner.class)
public class WinkelmandjeControllerTest
{

    @InjectMocks
    WinkelmandjeController winkelmandjeController;

    Lp lp;
    Lp lp2;
    Game game;
    List<Artikel> artikelsInMandje;
    List<Artikel> artikelsInMandjeTestLijst;
    int totaalBedrag;
    int aantalArtikels;
    ArtikelLijnInBestelling lijn;


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

        lp2 = new Lp();
        lp2.setId(2);
        lp2.setTitel("i love you at your darkest");
        lp2.setUitvoerder("behemoth");
        lp2.setEnumMuziekGenre(EnumMuziekGenre.METAL);
        lp2.setPrijs(30);
        lp2.setLeverancier("nuclear blast");
        lp2.setType("lp");

        game = new Game();
        game.setId(3);
        game.setTitel("quake");
        game.setUitgever("idgames");
        game.setEnumGameGenre(EnumGameGenre.FPS);
        game.setPrijs(50);
        game.setLeverancier("activision");
        game.setType("game");

        artikelsInMandje = new ArrayList<>();

        artikelsInMandjeTestLijst = new ArrayList<>();
        artikelsInMandjeTestLijst.add(lp);
//        artikelsInMandjeTestLijst.add(lp2);
//        artikelsInMandjeTestLijst.add(game);

        lijn = new ArtikelLijnInBestelling();
        lijn.setArtikel(lp);
        lijn.setAantal(2);
        lijn.setTotaalBedragLijn(lijn.getAantal() * lijn.getArtikel().getPrijs());

    }

    @Test
    public void artikelLijnToevoegenAanWinkelwagenTest()
    {

        winkelmandjeController.artikelToevoegen(lp);

        Assert.assertEquals(winkelmandjeController.getArtikelsInMandje().get(0).getArtikel(), lijn.getArtikel());

    }

    @Test
    public void tweeKeerZelfdeArtikelToevoegenAanWinkelMandjeTest()
    {
        winkelmandjeController.artikelToevoegen(lp);
        winkelmandjeController.artikelToevoegen(lp);

        Assert.assertEquals(winkelmandjeController.getArtikelsInMandje().size(), 1);
    }

    @Test
    public void tweeArtikelsToevoegenAanWinkelMandjeTest()
    {
        winkelmandjeController.artikelToevoegen(lp);
        winkelmandjeController.artikelToevoegen(game);

        Assert.assertEquals(winkelmandjeController.getArtikelsInMandje().size(), 2);
    }

    @Test
    public void totaalBedragBestellingTest()
    {
        winkelmandjeController.setAantalArtikel(1);
        winkelmandjeController.artikelToevoegen(lp);
        winkelmandjeController.setAantalArtikel(1);
        winkelmandjeController.artikelToevoegen(lp2);
        winkelmandjeController.setAantalArtikel(1);
        winkelmandjeController.artikelToevoegen(game);

        totaalBedrag = lp.getPrijs() + lp2.getPrijs() + game.getPrijs();

        Assert.assertEquals(winkelmandjeController.getTotaalBedragBestelling(), totaalBedrag);
    }

    @Test
    public void resetWinkelmandTest()
    {
        winkelmandjeController.setAantalArtikel(1);
        winkelmandjeController.artikelToevoegen(lp);
        winkelmandjeController.setAantalArtikel(1);
        winkelmandjeController.artikelToevoegen(lp2);
        winkelmandjeController.setAantalArtikel(1);
        winkelmandjeController.artikelToevoegen(game);

        winkelmandjeController.resetWinkelmand();

        Assert.assertTrue(winkelmandjeController.getArtikelsInMandje().isEmpty());


    }




}
