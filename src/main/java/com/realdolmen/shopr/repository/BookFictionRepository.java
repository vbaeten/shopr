package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookFictionRepository extends CrudRepository <BookFiction, Long>{
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

}
