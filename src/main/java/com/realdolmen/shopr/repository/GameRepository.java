package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Game;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GameRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    public Game findById(int id) {
        return entityManager.find(Game.class, id);
    }

    public List<Game> findAllGames()
    {
        return entityManager.createNamedQuery(Game.FIND_ALL, Game.class).getResultList();
    }

    public void insert(Game game )
    {
        entityManager.persist(game);
    }

    public Game findByName(String titel) {
        return entityManager.createNamedQuery(Game.FIND_BY_NAME, Game.class).setParameter("game", titel).getSingleResult();
    }


}
