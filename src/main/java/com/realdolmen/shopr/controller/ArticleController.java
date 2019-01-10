package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.service.ArticleService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class ArticleController {

    @Inject
    private ArticleService articleService;

    @ManagedProperty("#{param.id}")
    private int selectedId;
    private String selectedArticleType;

    private Article article;
    private List<OrderLine> orderLines = new ArrayList<>();
    private boolean editable;


    public Article getArticleById(int id) {
        return this.articleService.findById(id);
    }

    public List<Article> getAllArticles() {
        return this.articleService.findAllArticles();
    }

    public String removeArticleById(int id) {
        if (id == selectedId) {
            this.articleService.removeById(id);
        }
        return "articleOverview?faces-redirect=true";
    }

    public String editArticleById(int id) {
        this.article = articleService.findById(id);
        this.editable = true;
        return null;
    }

    public String saveArticleById(int id) {
        this.editable = false;
        return null;
    }

    public String submitArticleType() {
        switch (selectedArticleType) {
            case "game":
                return "addGame?faces-redirect=true";
            case "lp":
                return "addLp?faces-redirect=true";
            case "fiction":
                return "addFictionBook?faces-redirect=true";
            case "nonFiction":
                return "addNonFictionBook?faces-redirect=true";
        }
        return null;
    }

    public String gotoDetails(Article article) {
        this.article = article;
        if (article instanceof Game) {
            return "gameDetails?faces-redirect=true&includeViewParams=true";
        } else if (article instanceof Lp) {
            return "lpDetails?faces-redirect=true&includeViewParams=true";
        } else if (article instanceof Fiction) {
            return "fictionDetails?faces-redirect=true&includeViewParams=true";
        } else if (article instanceof NonFiction) {
            return "nonFictionDetails?faces-redirect=true&includeViewParams=true";
        }
        return null;
    }


    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }

    public String getSelectedArticleType() {
        return selectedArticleType;
    }

    public void setSelectedArticleType(String selectedArticleType) {
        this.selectedArticleType = selectedArticleType;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
