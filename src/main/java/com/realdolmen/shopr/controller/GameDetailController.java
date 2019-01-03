package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class GameDetailController {


    private int id;
    private Game game;


    @Inject
    private GameService gameService;


    public void init(){
        if (id==0){
            game = new Game();
        }else
        getGameById(id);
    }


    private void getGameById(int id){
        game = gameService.findById(id);
    }

    public String delete(){
        game = this.gameService.findById(id);
        this.gameService.delete(game);

        return "/overview-pages/games-overview.xhtml?faces-redirect=true";
    }






    public int getId() {
        return id;
    }

    public void setId(int   id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
