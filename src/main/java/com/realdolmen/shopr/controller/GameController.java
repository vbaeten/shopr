package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@ManagedBean
@ViewScoped
public class GameController {
    private Logger logger = Logger.getLogger(GameController.class.getName());

    private Game newGame = new Game();

    @Inject
    private GameService gameService;

    public Game getNewGame() {
        return newGame;
    }

    public void setNewGame(Game newGame) {
        this.newGame = newGame;
    }

    public List<Game> getGames() {
        return this.gameService.findAllGames();
    }

    public void submit() {
        logger.log(Level.INFO, "submit !!!");
        this.gameService.insert(getNewGame());
    }

}
