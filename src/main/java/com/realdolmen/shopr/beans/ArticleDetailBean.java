package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.ArticleService;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ArticleDetailBean implements Serializable {

    private int id;
    private Article article;
    private Lp lp;

    @Inject
    private ArticleService articleService;

    public void init(int id) {
        getArticleById(id);
    }

    private void getArticleById(int id) {
        article = articleService.findArticleById(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
