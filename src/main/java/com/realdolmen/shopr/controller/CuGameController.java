package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.GameGenre;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class CuGameController {
    private Game game;
    private Long id;

    @Inject
    private GameService gameService;

    public void init() {
        if (id == null) {
            game = new Game();
        } else {
            getGameById(id);
        }
    }

    private void getGameById(Long id) {
        game = gameService.findGameById(id);
    }

    public String submit() {
        if (id == null) {
            this.gameService.insert(game);
            game = new Game();
        } else {
            this.gameService.update(game);
        }
        return "/overview/games.xhtml?faces-redirect=true";
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GameGenre[] getGameGenres() {
        return GameGenre.values();
    }
}
