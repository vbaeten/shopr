package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.GameRepository;

import javax.inject.Inject;
import java.util.List;

public class GameService {
    @Inject
    private GameRepository gameRepository;

    public Game findGameById(int id) {
        return gameRepository.findById(id);
    }

    public List<Game> findAllgames() {
        return gameRepository.findAll();
    }

    public Game findGameByTitel(String name) {
        return gameRepository.findByTitel(name);
    }
    public void insert(Game game) {
        gameRepository.insert(game);
    }

    public void removeById(int id) {
        gameRepository.remove(id);
    }

}
