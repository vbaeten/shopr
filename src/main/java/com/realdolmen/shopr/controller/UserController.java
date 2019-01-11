package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class UserController implements Serializable {

    private User newUser ;
    private User currentUser ;

    @Inject
    private UserService userService;

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

    public void submit() {
        this.userService.insert(newUser);
    }

    public String gotoArticles() {
        return "articles.xhtml";
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getUserById(int id){
        return this.userService.findUserById(id);
    }

    public void updateFavourites(Article article){
        if (this.currentUser.hasFavourite(article)){
            this.currentUser.deleteFavourite(article);
        }
        else {
            this.currentUser.addFavourite(article);
        }
        userService.update(currentUser);
    }

//    public List<Article> findFavourites(){
//        userService.findFavourites(currentUser.getId());
//    }
}
