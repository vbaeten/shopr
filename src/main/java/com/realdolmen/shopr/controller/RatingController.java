package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Rating;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.RatingService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;
// TODO: bij delete article, zien dat ook alle reviews voor dat article gewist worden
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

    public void submit(int articleId, int currentUserId){
        newRating.setUser(userController.getUserById(currentUserId));
        this.ratingService.insert(newRating, articleId);
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
