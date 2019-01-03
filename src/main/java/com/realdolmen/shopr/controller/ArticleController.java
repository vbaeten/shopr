package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.LPRepository;
import com.realdolmen.shopr.service.*;
import org.hamcrest.core.IsInstanceOf;

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
    @Inject
    BookFictionController bookFictionController;
    @Inject
    BookNonFictionController bookNonFictionController;
    Article article = new Article();
    LP lp = new LP();
    Book book = new Book();
    Game game = new Game();
    @Inject
    private ArticleService articleService;

    @Inject
    private BookService bookService;

    @Inject
    private LPService lpService;

    public String goToArticleDetail(Article article) {
        this.article = article;
        if (LP.class.isInstance(article)) {
            return "lpdetail";
        } else if (Game.class.isInstance((article))) {
            return "gamedetail";
        } else if (Book.class.isInstance(article)) {
            book = (Book) article;
            if (book.getBooktype().equals("nonfiction")) {
                return "booknonfictiondetail";
            } else {
                return "bookfictiondetail";
            }
        } else {
            return "ERROR";
        }
    }

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