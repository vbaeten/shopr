package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.GameRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.inject.Inject;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GameServiceTest {
    @InjectMocks
    private GameService gameService;

    private Game game;
    private Game game2;
    private List<Game> games;

    @Mock
    private GameRepository gameRepository;


    @Before
    public void init(){
        game=new Game();
        game2=new Game();
        game.setId(1);
        games = new ArrayList<>();
        games.add(game);

    }

    @Test
    public void shouldFindGameById(){
        //intialise id and set it to the game id
        int id = game.getId();
        //we tell the mocked repos to findbyid and return init game
        when(gameRepository.findById(id)).thenReturn(game);
        // we call our service function with the same id as the mocked repos
        Game result = gameService.findById(id);
        // we check if the result of the called service function returns the correct object
        assertEquals(result , game);
        verify(gameRepository, times(1)).findById(id);
    }

    @Test
    public void shouldFindAllGames(){

        when(gameRepository.findAllGames()).thenReturn(games);
        List<Game> resultList = gameService.findAllGames();
        assertEquals(resultList,games);
        verify(gameRepository,times(1)).findAllGames();


    }

    @Test
    public void shouldDeleteGame(){

        gameService.delete(game);
        verify(gameRepository,times(1)).delete(game);
    }

    @Test
    public void shouldInsertGame(){

      gameService.insert(game);
      verify(gameRepository,times(1)).insert(game);
    }

    @Test
    public void shouldUpdateGame(){
        gameService.update(game);
        verify(gameRepository,times(1)).update(game);

    }






}
