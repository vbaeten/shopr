package com.realdolmen.shopr.service;

import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class RatingService
{
@Inject
    RatingRepository ratingRepository;

}
