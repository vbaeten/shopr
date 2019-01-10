package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class GameController {

    @Inject
    private GameService gameService;

    private Game game = new Game();


    public Game findById(int id) {
        return this.gameService.findById(id);
    }

    public List<Game> findAll() {
        return this.gameService.findAll();
    }

    public void removeById(int id) {
        this.gameService.removeById(id);
    }

    public String save() {
        this.gameService.insert(game);
        return "articleManagement?faces-redirect=true";
    }

    public String gotoDetails(Game game) {
        this.game = game;
        return "gameDetails?faces-redirect=true&includeViewParams=true";
    }


    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


}
