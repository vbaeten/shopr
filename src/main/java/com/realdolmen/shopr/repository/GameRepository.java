package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GameRepository {
    @PersistenceContext
    private EntityManager em;

    public Game findById(int id) {
        return em.find(Game.class, id);
    }

    public List<Game> findAll() {
        return em.createNamedQuery(Game.FIND_ALL, Game.class).getResultList();
    }


    public Game findByTitel(String name) {
        return em.createNamedQuery(Game.FIND_BY_TITEL, Game.class).setParameter("game", name).getSingleResult();
    }

    public void insert(Game game) {
        em.persist(game);
    }

    public void remove(int id) {
        Game gameById = findById(id);
        em.remove(gameById);
    }

}
