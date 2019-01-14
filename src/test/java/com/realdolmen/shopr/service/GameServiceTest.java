package com.realdolmen.shopr.service;

import com.realdolmen.shopr.controller.GameController;
import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.GameRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GameServiceTest
{
    @InjectMocks
    GameService gameService;

    @Mock
    GameRepository gameRepository;

    Game game;
    Beoordeling beoordeling;
    User user;

    @Before
    public void init()
    {
        game = new Game();
        game.setId(1);
        game.setTitel("quake");
        game.setUitgever("uitgever");
        game.setLeverancier("leverancier");
        game.setMinLeeftijd(12);
        game.setEnumGameGenre(EnumGameGenre.FPS);
        game.setPrijs(50);

        user = new User();
        user.setId(10);
        user.setName("meyers");
        user.setFirstName("indy");
        user.setRole(EnumRoles.USER);
    }


    @Test
    public void updateGameTest()
    {
        when(gameRepository.findById(1)).thenReturn(game);
        game.setTitel("titel");
        game.setPrijs(100);
        game.setMinLeeftijd(18);
        game.setEnumGameGenre(EnumGameGenre.RACE);

        gameService.update(game);
        Assert.assertEquals("titel", game.getTitel());
        int prijs = game.getPrijs();
        Assert.assertEquals(100, prijs);
        Assert.assertEquals(EnumGameGenre.RACE, game.getEnumGameGenre());
    }

    @Test
    public void insertLpTest()
    {
        doNothing().when(gameRepository).insert(game);
        gameService.insert(game);
        verify(gameRepository, times(1)).insert(game);
    }

    @Test
    public void testFindById()
    {
        when(gameRepository.findById(1)).thenReturn(game);
        Game gametest = gameService.findGameById(1);
        Assert.assertEquals(game, gametest);
    }


}
