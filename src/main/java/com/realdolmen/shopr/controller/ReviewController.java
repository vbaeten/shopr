package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.Review;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ItemService;
import com.realdolmen.shopr.service.ReviewService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class ReviewController {


    private int id;
    private Review review = new Review();
    private User user;

    @Inject
    private ReviewService reviewService;
    @Inject
    private ItemService itemService;
    @Inject
    private UserService userService;

    public void addReview() {
        this.user = userService.getUserById(1);
        this.review.setUser(this.user);
        this.review.setItem(getItemById());
        this.reviewService.addReview(this.review);
        this.review = new Review();
    }

    public List<Review> getReviews() {
        return this.reviewService.findAllReviews();
    }


    private Item getItemById() {
    return itemService.getById(id);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
