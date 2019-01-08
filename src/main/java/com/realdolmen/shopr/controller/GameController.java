package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.GameGenre;
import com.realdolmen.shopr.service.GameService;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class GameController implements Serializable {
    Game newGame = new Game();
    int gameId;

    @Inject
    private GameService gameService;

    @Inject
    private UserController userController;


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
        gameService.delete(newGame);
        newGame = new Game();
        return "gamesDataTable?faces-redirect=true";
    }

    public void update(){
        this.gameService.update(newGame);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item successfully updated", newGame.getTitle()));
    }


}
