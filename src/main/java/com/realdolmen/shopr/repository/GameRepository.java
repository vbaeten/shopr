package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GameRepository extends CrudRepository<Game, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}
