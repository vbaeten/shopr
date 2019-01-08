package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.GameRepository;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Stateless
public class GameService implements Serializable {
    @Inject
    private GameRepository gameRepository;

    @Inject
    private RatingRepository ratingRepository;

    public Game findGameById(int id) {
        return gameRepository.findById(id);
    }

    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }

    public Game findGameByTitle(String title) {
        return gameRepository.findByTitle(title);
    }

    public void updateTitle(int id, String newTitle) {
        Game game = gameRepository.findById(id);
        game.setTitle(newTitle);
    }

    public void insert(Game game) {
        gameRepository.insert(game);
    }

    public void delete(Game game){
        ratingRepository.deleteByArticle(game);
        gameRepository.delete(game.getId());
    }

    public void update(Game game){
        gameRepository.update(game);
    }
}
