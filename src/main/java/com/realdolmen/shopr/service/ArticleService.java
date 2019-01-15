package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.repository.ArticleRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Stateless
public class ArticleService implements Serializable {
    @Inject
    ArticleRepository articleRepository;

    public Article findById(int id) {
        return articleRepository.findById(id);
    }

    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }
}
