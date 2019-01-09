package com.realdolmen.shopr;

import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public abstract class AbstractPersistenceTest {

    protected static EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;

    @BeforeClass
    public static void initializeEntityManagerFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("shoprPU");
    }

    @Before
    public void initializeEntityManagerWithTransaction() {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    @After
    public void rollbackTransactionAndCloseEntityManager() {
        if(entityManager != null) {
            entityManager.getTransaction().rollback();
            entityManager.close();
        }
    }

    @AfterClass
    public static void destroyEntityManagerFactory() {
        if( entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    protected void flushAndClear() {
        entityManager.flush();
        entityManager.clear();
    }


}
