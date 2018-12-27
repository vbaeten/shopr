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

    public Game findById(Long id) { return gameRepository.findById(id); }

    public List<Game> findAll() { return gameRepository.findAll(); }

    public Game findByTitle(String title) { return gameRepository.findByTile(title); }

    public void save(Game game) { gameRepository.save(game);}

}
