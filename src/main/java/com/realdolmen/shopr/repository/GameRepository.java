package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GameRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Game> findAllGames() {
        return entityManager.createNamedQuery(Game.FIND_ALL, Game.class).getResultList();
    }

    public void insert(Game newGame) {
        this.entityManager.persist(newGame);
    }

    public Game findById(int id) {
        return entityManager.find(Game.class, id);
    }

    public void delete(Game toDeleteG) {
        this.entityManager.remove(entityManager.contains(toDeleteG)? toDeleteG: entityManager.merge(toDeleteG));
    }

    public void update(Game game) {
        this.entityManager.merge(game);
    }
}
