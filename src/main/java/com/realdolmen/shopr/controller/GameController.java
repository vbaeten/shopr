package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.enums.GameGenre;
import com.realdolmen.shopr.service.GameService;

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

    public void initDetailView(Long id) {
        this.game = gameService.findGameById(id);
    }

    public List<Game> getGames() {
        return this.gameService.findAllGames();
    }

    public List<GameGenre> getGameGenres() {
        return Arrays.asList(GameGenre.values());
    }

    public void add(Game game) {
        this.gameService.insert(game);
    }

    public Game getGamebyId(Long id) {
        return gameService.findGameById(id);
    }

    public String saveGame() {
        this.gameService.insert(game);
        return "overview";
    }

    public String removeGame(Game game) {
        gameService.removeById(game.getId());
        return "overview";
    }

    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}