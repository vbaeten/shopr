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
        return entityManager.createNamedQuery(Game.FIND_ALL, Game.class).getResultList();
    }

    public Game findByTitle(String title) {
        return entityManager.createNamedQuery(Game.FIND_BY_TITLE, Game.class).setParameter("title", title).getSingleResult();
    }

    public void insert(Game game) {
        entityManager.persist(game);
    }

    public void remove(int id) {
        Game gameById = findById(id);
        entityManager.remove(gameById);
    }

}
