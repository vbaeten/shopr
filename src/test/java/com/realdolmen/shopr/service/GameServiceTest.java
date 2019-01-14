package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.GameRepository;
import com.realdolmen.shopr.repository.RatingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)

public class GameServiceTest {
    @InjectMocks
    GameService gameService;

    @Mock
    GameRepository gameRepository;

    @Mock
    RatingRepository ratingRepository;

    private Game game;
    private Game game2;

    @Before
    public void init() {
        game = new Game();
        game.setId(1);
        game.setTitle("TestTitle");

        game2 = new Game();
        game2.setId(2);
    }

    @Test
    public void testFindGameById() {
        when(gameRepository.findById(1)).thenReturn(game);
        Game foundGame = gameService.findGameById(1);
        Assert.assertEquals(game, foundGame);
    }

    @Test
    public void testInsert() {
        doNothing().when(gameRepository).insert(game);
        gameService.insert(game);
        verify(gameRepository, times(1)).insert(game);
    }

    @Test
    public void testDelete(){
        doNothing().when(gameRepository).delete(1);
        gameService.delete(game);
        verify(gameRepository, times(1)).delete(1);
    }

    @Test
    public void testUpdate(){
        when(gameRepository.findById(1)).thenReturn(game);
        gameService.update(game);
        verify(gameRepository, times(1)).update(game);
    }

    @Test
    public void testFindAllGames(){
        when(gameRepository.findAll()).thenReturn(Arrays.asList(game, game2));
        List<Game> expectedFictionList = gameService.findAllGames();
        Assert.assertEquals(expectedFictionList, Arrays.asList(game, game2));
    }
}
