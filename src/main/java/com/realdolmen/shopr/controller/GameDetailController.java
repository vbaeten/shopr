package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class GameDetailController {
    private Long id;
    private Game game;

    @Inject
    private GameService gameService;

    public void init() {
        getGameById(id);
    }

    private void getGameById(Long id) {
        game = gameService.findGameById(id);
    }

    public String delete() {
        gameService.delete(id);
        return "/overview/games.xhtml?faces-redirect=true";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
