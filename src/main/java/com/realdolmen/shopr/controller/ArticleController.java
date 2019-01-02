package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.service.ArticleService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class ArticleController {

    private Article newArticle = new Article();

    @Inject
    ArticleService articleService;

    public Article getNewArticle() {
        return newArticle;
    }

    public void setNewArticle(Article newArticle) {
        this.newArticle = newArticle;
    }

    public List<Article> getArticles() {
        return this.articleService.findAllArticles();
    }

    public void submit() {
        this.articleService.insert(newArticle);
    }

}
