package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.service.GameService;
import com.realdolmen.shopr.service.LPService;

import javax.inject.Inject;
import java.util.List;

public class GameController {
    Game game = new Game();

    @Inject
    private GameService gameService;

    public Game getGame() { return  game;}

    public void setGame(Game game){
        this.game = game;
    }

    public List<Game> getGames(){
        return this.gameService.findAllGames();
    }

    public void add(Game game){
        this.gameService.insert(game);
    }
}
