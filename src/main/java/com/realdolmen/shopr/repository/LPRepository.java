package com.realdolmen.shopr.repository;


import com.realdolmen.shopr.domain.LP;

import javax.persistence.EntityManager;

public class LPRepository {



    private EntityManager entityManager;

    public void insert(LP lp) {

        entityManager.persist(lp);

    }
}
