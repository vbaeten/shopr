package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.repository.ArticleRepository;
import com.realdolmen.shopr.repository.CrudRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
@Stateless
public class ArticleService extends CrudService<Article, Long>{
    @Inject
    private ArticleRepository articleRepository;

    @Override
    CrudRepository<Article, Long> getRepository() {
        return articleRepository;
    }

    public void updateTitle(Long articleId, String newTitle) {
        Article article = articleRepository.findByPrimaryKey(articleId);
        article.setTitle(newTitle);
    }

}
