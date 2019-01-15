package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.enums.GameGenre;
import com.realdolmen.shopr.repository.GameRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class GameServiceTest {
    @Mock
    GameRepository gameRepository;

    @InjectMocks
    GameService gameService;

    List<Game> gameList;
    Game game1;
    Game game2;

    @Before
    public void init() {
        gameList = new ArrayList<>();

        //  Game 1
        game1 = new Game();
        game1.setTitle("test");
        game1.setPrice(BigDecimal.valueOf(10));
        game1.setSupplierId("supplierid");
        game1.setType("game");
        game1.setMinimumAge(8L);
        game1.setPublisher("publisher");
        game1.setGameGenre(GameGenre.MMORPG);

        //  Game 2
        game2 = new Game();
        game2.setTitle("test2");
        game2.setPrice(BigDecimal.valueOf(11));
        game2.setSupplierId("supplierid2");
        game2.setType("game2");
        game2.setMinimumAge(8L);
        game2.setPublisher("publisher2");
        game2.setGameGenre(GameGenre.FPS);

        gameList.add(game1);
        gameList.add(game2);
    }

    @Test
    public void testGameRepositoryFindAll() {
        when(gameRepository.findAll()).thenReturn(this.gameList);
        assertEquals("size should be 2", 2, gameList.size());
        assertEquals("Title should be 'test'", "test", gameList.get(0).getTitle());
    }

    @Test
    public void testGameRepositoryRemove() {
        doNothing().when(gameRepository).remove(game1);
        gameRepository.remove(game1);
        verify(gameRepository, times(1)).remove(game1);
    }

    @Test
    public void testGameRepositoryInsert() {
        when(gameRepository.insert(game1)).thenReturn(game1);
        gameService.insert(game1);
        verify(gameRepository, times(1)).insert(game1);
    }

    @Test
    public void testGameRepositoryFindById() {
        Long primaryKey = 1L;
        when(gameRepository.findByPrimaryKey(primaryKey)).thenReturn(game1);
        Game gameById = gameService.findByPrimaryKey(primaryKey);
        assertEquals("gameById is game1", game1, gameById);
    }

    @Test
    public void testGameRepositoryUpdate() {
        when(gameRepository.findByPrimaryKey(1L)).thenReturn(game1);
        gameService.update(game1);
        verify(gameRepository, times(1)).update(game1);
    }
}
