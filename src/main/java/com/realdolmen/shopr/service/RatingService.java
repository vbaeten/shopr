package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Rating;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class RatingService {
    @Inject
    RatingRepository ratingRepository;

    public Rating getRatingById(int id) {
        return ratingRepository.findById(id);
    }

    public List<Rating> getRatingsByArticle(Article article) {
        return ratingRepository.findByArticle(article);
    }

    public List<Rating> getRatingsByArticleId(int id) {
        return ratingRepository.findByArticleId(id);
    }

    public void insert(Rating rating, int id){
        ratingRepository.insert(rating, id);
    }

}
