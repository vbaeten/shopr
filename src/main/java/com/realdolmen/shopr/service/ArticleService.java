package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.repository.*;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
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
