package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.GameGenre;
import com.realdolmen.shopr.service.GameService;
import org.omnifaces.cdi.ViewScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CuGameController implements Serializable {
    private Game game;
    private Long id;

    @Inject
    private GameService gameService;

    public void init() {
        if (id == null) {
            game = new Game();
        } else {
            game = gameService.findGameById(id);
        }
    }

    public String submit() {
        if (id == null) {
            gameService.insert(game);
            game = new Game();
        } else {
            gameService.update(game);
        }
        return "/overview/games.xhtml?faces-redirect=true";
    }

    public GameGenre[] getGameGenres() {
        return GameGenre.values();
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
}
