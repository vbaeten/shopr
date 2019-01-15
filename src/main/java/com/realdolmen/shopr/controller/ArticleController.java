package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.service.ArticleService;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class ArticleController implements Serializable {
    Article newArticle = new Article();
    int articleId;

    @Inject
    ArticleService articleService;

    public void init() {
        newArticle = getArticleById(articleId);
    }

    public List<Article> getArticles() {
        return this.articleService.findAllArticles();
    }

    public Article getArticleById(int id) {
        return newArticle = articleService.findById(id);
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String navigateToDetailPage(Article article) {
        switch (article.getTypes()) {
            case "LP":
                return "lpDetail.xhtml";
            case "GAME":
                return "gameDetail.xhtml";
            case "FICTION":
                return "fictionDetail.xhtml";
            case "NON_FICTION":
                return "nonFictionDetail.xhtml";
        }
        return "pageNotFound.xhtml";
    }

    public List<String> findAllTypes(){
        return articleService.findAllTypes();
    }
}
