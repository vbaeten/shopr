package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.GameRepository;
import com.realdolmen.shopr.repository.OverviewRepository;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;


//businesslogic

@Stateless
public class GameService
{
    @Inject
    private GameRepository gameRepository;

    @Inject
    RatingRepository ratingRepository;

    @Inject
    OverviewRepository overviewRepository;

    public List<Game> findAllGames()
    {
        return gameRepository.findAllGames();
    }

    public Game findGameByTitel(String titel)
    {
        return gameRepository.findByName(titel);
    }

    public Game findGameById(int id)
    {
        return gameRepository.findById(id);
    }

    public void insert(Game game)
    {
        gameRepository.insert(game);
    }

     public void update(Game game) {
        gameRepository.update(game);
    }

    public void delete(int id) {
        for (Beoordeling b : ratingRepository.findBeoordelingenBepaaldArtikel(overviewRepository.findById(id).getId()))
        {
            ratingRepository.delete(b);
        }
        Game game = gameRepository.findById(id);
        gameRepository.delete(game);
    }

}
