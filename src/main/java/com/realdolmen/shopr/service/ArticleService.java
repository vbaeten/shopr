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

    public void updateTitle(Long articleId, String newTitle) {
        Article article = articleRepository.findByArticleId(articleId);
        article.setTitle(newTitle);
    }

    public Article findById(Long articleId){
        return articleRepository.findByArticleId(articleId);
    }

    public void removeArticleById (Long articleId) {
        Article article = articleRepository.findByArticleId(articleId);
        articleRepository.remove(article);
    }

}
