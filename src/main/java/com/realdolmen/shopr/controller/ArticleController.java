package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.LPRepository;
import com.realdolmen.shopr.service.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@SessionScoped
public class ArticleController {
    @Inject
    LPController lpController;
    @Inject
            GameController gameController;
    @Inject
            BookController bookController;
    Article article = new Article();
    LP lp = new LP();
    Book book = new Book();
    Game game = new Game();
    @Inject
    private ArticleService articleService;

    @Inject
    private LPService lpService;

    public Article getArticle() {
        return article;
    }

    public List<Article> getArticles() {
        return this.articleService.findAllArticles();
    }

    public String creator(Article article) {
        if (article.getType().equals("lp")) {
            return lpController.getLPById(article.getId()).getArtist();
        } else if (article.getType().equals("book")) {
            return bookController.getBookbyId(article.getId()).getAuthor();
        } else {
            return gameController.getGamebyId(article.getId()).getPublisher();
        }
    }
}