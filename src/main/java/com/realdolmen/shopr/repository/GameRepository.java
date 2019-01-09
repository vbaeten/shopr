package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GameRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Game findById(Long id) {
        return entityManager.find(Game.class, id);
    }

    public List<Game> findAll() {
        return entityManager.createQuery("select g from Game g", Game.class).getResultList();
    }

    public Game findByTile(String title) {
        return  entityManager.createQuery("select g from Game g where g.title = :title", Game.class).getSingleResult();
    }

    public void save(Game game) { this.entityManager.persist(game); }
}
