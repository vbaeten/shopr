package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.*;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
@Stateless
public class ArticleService {
    @Inject
    private ArticleRepository articleRepository;

    public List<Article> findAllArticles() {
        List<Article> articles = articleRepository.findAll();
        return articles;
    }

    public void updateTitle(Long id, String newTitle) {
        Article article = articleRepository.findById(id);
        article.setTitle(newTitle);
    }

    public Article findById(Long id){
        return articleRepository.findById(id);
    }

    public void removeArticleById (Long id) {
        Article article = articleRepository.findById(id);
        articleRepository.remove(article);
    }

}