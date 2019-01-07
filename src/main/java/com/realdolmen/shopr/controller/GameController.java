package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.GameGenre;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class GameController implements Serializable {
    Game newGame = new Game();
    int gameId;

    @Inject
    private GameService gameService;

    public void init(){
        newGame = getGameById(gameId);
    }

    public Game getNewGame(){
        return newGame;
    }

    public void setNewGame(Game game){
        this.newGame = game;
    }

    public List<Game> getGames(){
        return this.gameService.findAllGames();
    }

    public void submit(){
        this.gameService.insert(newGame);
        this.newGame = new Game();
    }

    public Game getGameById(int id){
        return newGame = gameService.findGameById(id);
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int id) {
        this.gameId = id;
    }

    public GameGenre[] getGameGenre() { return GameGenre.values(); }

    public String delete(){
        gameService.delete(newGame.getId());
        newGame = new Game();
        return "gamesDataTable?faces-redirect=true";
    }


}
