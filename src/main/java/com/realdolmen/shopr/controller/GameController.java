package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class GameController
{
    @Inject
    private GameService gameService;

    private Game newGame = new Game();

    public Game getNewGame()
    {
        return newGame;
    }

    public List<Game>getGames()
    {
        return this.gameService.findAllGames();
    }

    public void setNewGame(Game newGame)
    {
        this.newGame = newGame;
    }

    public void submit()
    {
        this.gameService.insert(newGame);
    }
}
