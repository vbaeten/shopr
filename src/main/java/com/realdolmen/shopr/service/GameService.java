package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.GameRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class GameService {

    @Inject
    private GameRepository gameRepository = new GameRepository();



    public List<Game> findAllGames() {
        return this.gameRepository.findAllGames();
    }

    @Transactional
    public void insert(Game newGame) {
        this.gameRepository.insert(newGame);
    }


    public Game findById(Long id) {

       return this.gameRepository.findById(id);


    }
}
