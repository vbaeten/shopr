package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@RequestScoped
public class GameController implements Serializable {
    private Game newGame ;
    @PostConstruct
    public void prepare(){
        newGame = new Game();
    }

    @Inject
    private GameService gameService;

    public Game getNewGame() {
        return newGame;
    }

    public void setNewGame(Game newGame) {
        this.newGame = newGame;
    }

    public List<Game> getGames(){
        return this.gameService.findAllgames();
    }

    public void submit(){
        this.gameService.insert(newGame);
    }

    public void removeById(int id) {
        this.gameService.removeById(id);
    }
}
