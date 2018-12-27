package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GameRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Game findById(int id) {
        return entityManager.find(Game.class, id);
    }

    public List<Game> findAll() {
        return entityManager.createQuery("select f from Game f ", Game.class).getResultList();
    }

    public Game findByTitle(String title) {
        return entityManager.createQuery(" select f from Game f where f.title =: title", Game.class).getSingleResult();
    }

    public void insert(Game game) {entityManager.persist(game);
    }
}
