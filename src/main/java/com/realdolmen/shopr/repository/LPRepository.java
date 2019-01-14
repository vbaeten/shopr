package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.LP;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LPRepository extends CrudRepository<LP, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}
