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
    private Game editGame = new Game();
    private boolean loadpanel;

    public boolean isLoadpanel()
    {
        return loadpanel;
    }

    public void setLoadpanel(boolean loadpanel)
    {
        this.loadpanel = loadpanel;
    }

    public Game getEditGame()
    {
        return editGame;
    }

    public void setEditGame(Game editGame)
    {
        this.editGame = editGame;
    }

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

    public void delete(Game game)
    {
gameService.delete(game.getId());
    }

    public void update()
    {
        this.loadpanel = false;
        gameService.update(this.editGame);
    }

    public void booleanAndGamePanelGame(Game game)
    {
        this.loadpanel = true;
        this.editGame = game;
    }
}
