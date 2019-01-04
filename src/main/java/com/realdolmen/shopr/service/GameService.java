package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.GameRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class GameService {

    @Inject
    private GameRepository gameRepository = new GameRepository();


    public List<Game> findAllGames() {
        return this.gameRepository.findAllGames();
    }


    public void insert(Game newGame) {
        this.gameRepository.insert(newGame);
    }


    public Game findById(int id) {

        return this.gameRepository.findById(id);


    }


    public void delete(Game toDeleteG) {
        this.gameRepository.delete(toDeleteG);
    }


    public void update(Game game) {
        this.gameRepository.update(game);
    }
}
