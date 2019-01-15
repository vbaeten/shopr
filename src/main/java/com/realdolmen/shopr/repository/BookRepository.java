package com.realdolmen.shopr.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Book;

public class BookRepository extends CrudRepository<Book, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}
