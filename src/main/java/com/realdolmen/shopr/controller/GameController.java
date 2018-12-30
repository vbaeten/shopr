package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.GameGenre;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class GameController {
    Game newGame = new Game();

    @Inject
    private GameService gameService;

    public Game getNewGame(){
        return newGame;
    }

    public void setNewGame(Game game){
        this.newGame = game;
    }

    public List<Game> getGames(){
        return this.gameService.findAllGames();
    }

    public void submit(Game game){
        this.gameService.insert(game);
    }


    public List<String> getGameGenres() {
        List<String> genreList = new ArrayList<>();
        for (GameGenre genre : GameGenre.values()) {
            genreList.add(genre.description);
        }
        return genreList;
    }

}
