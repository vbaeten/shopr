package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.domain.enums.BookGenre;
import com.realdolmen.shopr.domain.enums.GameGenre;
import com.realdolmen.shopr.service.GameService;
import com.realdolmen.shopr.service.LPService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
@RequestScoped
@ManagedBean
public class GameController {
    Game game = new Game();

    @Inject
    private GameService gameService;

    public Game getGame() { return  this.game;}

    public void setGame(Game game){
        this.game = game;
    }

    public List<Game> getGames(){
        return this.gameService.findAllGames();
    }

    public List<GameGenre> getGameGenres() {return Arrays.asList(GameGenre.values());}

    public void add(Game game){
        this.gameService.insert(game);
    }

    public Game getGamebyId(Long id) {
        return gameService.findGameById(id);
    }

    public String saveGame() {
        this.gameService.insert(game);
        return "overview";
    }
    public void removeGame(Game game) {
        gameService.removeById(game.getId());
    }

}
