package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class GameController {

    private Game game = new Game();

    @Inject
    private GameService gameService;


    public String gotoDetails(Game game) {
        this.game = game;
        return "gameDetails";
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Game findById(int id) {
        return this.gameService.findById(id);
    }

    public List<Game> findAll() {
        return this.gameService.findAll();
    }

    public void removeById(int id) {
        this.gameService.removeById(id);
    }

    public void submit(Game game) {
        this.gameService.insert(game);
    }
}
