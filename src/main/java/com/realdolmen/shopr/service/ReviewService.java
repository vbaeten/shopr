package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.Review;
import com.realdolmen.shopr.repository.ReviewRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ReviewService {

    @Inject
    private ReviewRepository reviewRepository;

    public void addReview(Review review){
        this.reviewRepository.addReview(review);
    }

    public List<Review> findAllReviews() {
        return this.reviewRepository.findAllReviews();
    }
}

