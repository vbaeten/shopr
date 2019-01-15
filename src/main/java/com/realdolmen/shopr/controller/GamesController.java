package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.service.GameService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class GamesController {
    @Inject
    private GameService gameService;

    public List<Game> getGames() {
        return this.gameService.findAllGames();
    }
}
