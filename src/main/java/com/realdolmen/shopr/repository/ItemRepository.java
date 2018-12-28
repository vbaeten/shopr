package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Item;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ItemRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public List<Item> findAll() {
        return entityManager.createNamedQuery(Item.FIND_ALL, Item.class).getResultList();
    }
}
