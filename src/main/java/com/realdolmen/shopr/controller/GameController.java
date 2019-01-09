package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@ManagedBean
@ViewScoped
public class GameController {

    private Game newGame = new Game();

    @Inject
    private GameService service;

    public Game getNewGame() { return newGame; }

    public void setNewGame(Game game) { this.newGame = game; }

    public List<Game> getGames() { return this.service.findAll(); }

    public Game getGameById(Long id) { return this.service.findById(id); }

    public Game getGameByTitle(String title) { return this.service.findByTitle(title); }

    public void save() {
       this.service.save(newGame);
    }

}
