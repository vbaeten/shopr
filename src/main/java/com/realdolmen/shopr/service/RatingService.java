package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Rating;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class RatingService {

    @Inject
    private RatingRepository ratingRepository;

    public Rating findByUsername(String username) { return ratingRepository.findByUsername(username); }

    public Rating findByScore(int score) { return ratingRepository.findByScore(score); }

    public void save(Rating rating) { ratingRepository.save(rating); }
}
