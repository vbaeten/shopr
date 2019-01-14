package com.realdolmen.shopr.util;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class Navigation {

    public String goToCreateBookFiction () {
        return ShoprEndpoints.CREATE_BOOKFICTION;
    }
    public String goToCreateBookNonFiction () {
        return ShoprEndpoints.CREATE_BOOKNONFICTION;
    }
    public String goToCreateGame () {
        return ShoprEndpoints.CREATE_GAME;
    }
    public String goToCreateLP () {
        return ShoprEndpoints.CREATE_LP;
    }
    public String goToDetailBookFiction () {
        return ShoprEndpoints.DETAIL_BOOKFICTION;
    }
    public String goToDetailBookNonFiction () {
        return ShoprEndpoints.DETAIL_BOOKFICTION;
    }
    public String goToDetailGame () {
        return ShoprEndpoints.DETAIL_GAME;
    }
    public String goToDetailLP () {
        return ShoprEndpoints.DETAIL_LP;
    }
    public String goToUpdateBookFiction() {
        return ShoprEndpoints.UPDATE_BOOKFICTION;
    }
    public String goToUpdateBookNonFiction() {
        return ShoprEndpoints.UPDATE_BOOKNONFICTION;
    }
    public String goToUpdateGame() {
        return ShoprEndpoints.UPDATE_GAME;
    }
    public String goToUpdateLP() {
        return ShoprEndpoints.UPDATE_LP;
    }
    public String goToArticleCreation() {
        return ShoprEndpoints.CREATE_ARTICLE;
    }
    public String goToIndex() {
        return ShoprEndpoints.INDEX;
    }
    public String goToShoppingCart(){
        return ShoprEndpoints.SHOPPING_CART;
    }
    public String goToOverview() {
        return ShoprEndpoints.OVERVIEW;
    }


}
