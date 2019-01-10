package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Review;
import com.realdolmen.shopr.repository.ReviewRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ReviewServiceTest {


    @InjectMocks
    private ReviewService reviewService;
    @Mock
    private ReviewRepository reviewRepository;

    private Review review;
    private Review review2;
    private List<Review>reviews=new ArrayList<>();

    public void init(){

        review = new Review();
        review2= new Review();
        reviews.add(review);
        reviews.add(review2);

    }


    @Test
    public void addReview() {

        reviewService.addReview(review);
        Mockito.verify(reviewRepository,Mockito.times(1)).addReview(review);
    }

    @Test
    public void findAllReviews() {

        Mockito.when(reviewRepository.findAllReviews()).thenReturn(reviews);
        List<Review> resultList = reviewService.findAllReviews();
        assertEquals(resultList,reviews);
        Mockito.verify(reviewRepository,Mockito.times(1)).findAllReviews();
    }
}