package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.GameGenre;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class GameController {

    private Game newGame = new Game();

    @Inject
    private GameService gameService;


    public void submit(){
        this.gameService.insert(newGame);
    }



    public GameGenre[]getGenres(){
        return GameGenre.values();
    }


    public List<Game> getGames(){
        return this.gameService.findAllGames();
    }


    public Game getNewGame() {
        return newGame;
    }

    public void setNewGame(Game newGame) {
        this.newGame = newGame;
    }

    public GameService getGameService() {
        return gameService;
    }

    public void setGameService(GameService gameService) {
        this.gameService = gameService;
    }
}
