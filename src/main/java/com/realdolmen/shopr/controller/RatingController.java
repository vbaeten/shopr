package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Rating;
import com.realdolmen.shopr.service.RatingService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class RatingController {
    Rating newRating = new Rating();
    int ratingId;

    @Inject
    RatingService ratingService;

    @Inject
    UserController userController;

    public void init(){
        newRating = getRatingById(ratingId);
    }

    public Rating getNewRating() {
        return newRating;
    }

    public void setNewRating(Rating rating) {
        this.newRating = rating;
    }

    public void submit(int id){
        // currentUser is null op dit moment
        newRating.setUser(userController.getCurrentUser());
        this.ratingService.insert(newRating, id);
        this.newRating = new Rating();
    }

    public Rating getRatingById(int id){
        return newRating = ratingService.getRatingById(id);
    }

    public List<Rating> getRatingsByArticle(Article article){
        return ratingService.getRatingsByArticle(article);
    }

    public List<Rating> getRatingsByArticleId(int id){
        return ratingService.getRatingsByArticleId(id);
    }


}
