package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
public class GameController {

    private Game newGame = new Game();

    @Inject
    private GameService service;

    public Game getNewGame() { return newGame; }

    public void setNewGame(Game game) { this.newGame = game; }

    public List<Game> getGames() { return this.service.findAll(); }

    public void submit() { this.service.save(newGame);}

}
