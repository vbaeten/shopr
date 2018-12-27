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

    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }
}
