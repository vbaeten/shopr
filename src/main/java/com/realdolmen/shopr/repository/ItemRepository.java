package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Item;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ItemRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Item> findAllItems() {
        return entityManager.createNamedQuery(Item.FIND_ALL, Item.class).getResultList();
    }

    public Item findById(int id) {
        return entityManager.find(Item.class,id);
    }
}
