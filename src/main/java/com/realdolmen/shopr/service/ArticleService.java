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
        return articleRepository.findAll();
    }

    public void updateTitle(Long id, String newTitle) {
        Article article = articleRepository.findById(id);
        article.setTitle(newTitle);
    }

}
