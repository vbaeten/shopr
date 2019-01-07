package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.service.ArticleService;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class ArticleController implements Serializable {
    Article newArticle = new Article();
    int articleId;

    @Inject
    ArticleService articleService;

    public void init(){
        newArticle = getArticleById(articleId);
    }

    public Article getArticleById(int id){
        return newArticle = articleService.findById(id);
    }

    public Article getNewArticle() {
        return newArticle;
    }

    public void setNewArticle(Article newArticle) {
        this.newArticle = newArticle;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
}
