package com.realdolmen.shopr.repository;


import com.realdolmen.shopr.domain.Review;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ReviewRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addReview(Review review) {
       this.entityManager.persist(review);
    }

    public List findAllReviews() {
        return entityManager.createQuery("select r from Review r ").getResultList();
    }
}

