package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.GameRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class GameService {

    @Inject
    private GameRepository gameRepository;

    public Game findGameById(int id) {
        return gameRepository.findById(id);
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public Game findTitle(String title) {
        return gameRepository.findByTitle(title);
    }

    public void insert(Game game) {
        gameRepository.insert(game);
    }

}
