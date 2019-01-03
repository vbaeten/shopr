package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.LPRepository;
import com.realdolmen.shopr.service.*;
import org.hamcrest.core.IsInstanceOf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
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
    Article article;
    LP lp;
    Book book ;
    BookFiction bookFiction;
    BookNonFiction bookNonFiction;
    Game game = new Game();
    @Inject
    private ArticleService articleService;

    @Inject
    private BookFictionService bookFictionService;

    @Inject
    private BookNonFictionService bookNonFictionService;
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
        } else if (BookFiction.class.isInstance(article)) {
            return "bookfictiondetail";
        } else if (BookNonFiction.class.isInstance(article)) {
            return "booknonfictiondetail";
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookFiction getBookFiction() {
        return bookFiction;
    }

    public void setBookFiction(BookFiction bookFiction) {
        this.bookFiction = bookFiction;
    }

    public BookNonFiction getBookNonFiction() {
        return bookNonFiction;
    }

    public void setBookNonFiction(BookNonFiction bookNonFiction) {
        this.bookNonFiction = bookNonFiction;
    }

    public String creator(Article article) {
        if (article.getType().equals("lp")) {
            return lpController.getLPById(article.getId()).getArtist();
        } else if (article.getType().equals("nonfiction") || article.getType().equals("fiction")) {
            return bookController.getBookbyId(article.getId()).getAuthor();
        } else {
            return gameController.getGamebyId(article.getId()).getPublisher();
        }
    }

}