package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.CrudRepository;
import com.realdolmen.shopr.repository.GameRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
@Stateless
public class GameService extends CrudService<Game, Long>{
    @Inject
    private GameRepository gameRepository;

    @Override
    CrudRepository<Game, Long> getRepository() {
        return gameRepository;
    }
}
