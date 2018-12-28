package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.ArtikelRepository;
import com.realdolmen.shopr.repository.GameRepository;

import javax.inject.Inject;
import java.util.List;

public class GameService {
    @Inject
    private GameRepository gameRepository;

    public Game findGameById(int id) {
        return gameRepository.findById(id);
    }

    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }

    public Game findGameByTitle(String title) {
        return gameRepository.findByTitle(title);
    }

    public void updateTitle(int id, String newTitel) {
        Game game = gameRepository.findById(id);
        game.setTitel(newTitel);
    }

    public void insert(Game game) {
        gameRepository.insert(game);
    }

    public void removeGameById(int id){
        gameRepository.remove(id);
    }
}
