package com.realdolmen.shopr.createDrop;

import org.junit.Ignore;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Ignore
public class CreateDropDataBaseSchema {
    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void exec() {
        Persistence.createEntityManagerFactory("shoprPU");
    }
}
