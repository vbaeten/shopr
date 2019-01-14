package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.enums.GameGenre;
import com.realdolmen.shopr.service.GameService;
import com.realdolmen.shopr.util.ShoprEndpoints;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@ViewScoped
@ManagedBean
public class GameController {

    @Inject
    private GameService gameService;
    private Game game = new Game();

    public void initDetailView(Long articleId) {
        this.game = gameService.findByPrimaryKey(articleId);
    }

    public List<Game> getGames() {
        return this.gameService.findAll();
    }

    public List<GameGenre> getGameGenres() {
        return Arrays.asList(GameGenre.values());
    }

    public void add(Game game) {
        this.gameService.insert(game);
    }

    public String update(Game game) {this.gameService.update(game);
        return ShoprEndpoints.OVERVIEW + "?faces-redirect=true";
    }

    public Game getGamebyArticleId(Long articleId) {
        return gameService.findByPrimaryKey(articleId);
    }

    public String saveGame() {
        this.gameService.insert(game);
        return ShoprEndpoints.OVERVIEW;
    }

    public String removeGame(Game game) {
        gameService.remove(game);
        return ShoprEndpoints.OVERVIEW;
    }

    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}