package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.repository.ArticleRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ArticleService {
    @Inject
    private ArticleRepository articleRepository;

    public Article findArticleById(int id) {
        return articleRepository.findById(id);
    }

    public List<Article> findAllArticles() {
        return articleRepository.findAllArticles();
    }

    public Article findArticleByTitle(String title) {
        return articleRepository.findByTitle(title);
    }

    public void insert(Article article) {
        articleRepository.insert(article);
    }

}
