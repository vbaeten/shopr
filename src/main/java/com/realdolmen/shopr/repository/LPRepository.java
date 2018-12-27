package com.realdolmen.shopr.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LPRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;
}
