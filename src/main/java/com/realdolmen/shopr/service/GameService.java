package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.GameRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
@Stateless
public class GameService {
    @Inject
    private GameRepository gameRepository;

    public Game findGameByArticleId(Long articleId) {
        return gameRepository.findByArticleId(articleId);
    }

    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }

    public Game findByTitle(String title) {
        return gameRepository.findByTitle(title);
    }

    public void updateTitle(Long articleId, String newTitle) {
        Game bookFiction = gameRepository.findByArticleId(articleId);
        bookFiction.setTitle(newTitle);
    }
    public void insert(Game game){
        gameRepository.insert(game);
    }

    public void update(Game game) {gameRepository.update(game);}

    public void removeByArticleId (Long articleId) {
        Game game = gameRepository.findByArticleId(articleId);
        gameRepository.remove(game);
    }
}
