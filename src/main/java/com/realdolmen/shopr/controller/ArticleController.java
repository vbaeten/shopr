package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.service.ArticleService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class ArticleController {

    @Inject
    private ArticleService articleService;

    public List<Article> getArticles() {
        return this.articleService.findAllArticles();
    }

    public void removeArticle(Article article) {
        articleService.removeArticleById(article.getArticleId());
    }
}