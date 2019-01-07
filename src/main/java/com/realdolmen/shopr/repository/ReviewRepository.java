package com.realdolmen.shopr.repository;


import com.realdolmen.shopr.domain.Review;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ReviewRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addReview(Review review) {
       this.entityManager.persist(review);
    }
}
