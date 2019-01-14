package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.SearchBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class SearchBeanRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public double findMinPrice(){
        return (double) entityManager.createNamedQuery(Article.FIND_MIN_PRICE).getSingleResult();
    }

    public double findMaxPrice(){
        return (double) entityManager.createNamedQuery(Article.FIND_MAX_PRICE).getSingleResult();
    }


}
