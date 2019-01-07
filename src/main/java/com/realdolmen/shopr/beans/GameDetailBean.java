package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class GameDetailBean {

    private int id;
    private Game game;

    @Inject
    private GameService gameService;

    public void init() {
        getGameById(id);
    }

    private void getGameById(int id) {
        game = gameService.findGameById(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
