package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ArticleRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Article findById(int id){ return entityManager.find(Article.class, id); }

//    public List<Article> findAll() {
//        return entityManager.createNamedQuery(Article.FIND_ALL, Article.class).getResultList();
//    }
//
//    public Article findByTitle(String title) {
//        return entityManager.createNamedQuery(Article.FIND_BY_TITLE, Article.class).setParameter("name", title).getSingleResult();
//    }
//
//    public void insert(Article article) {
//        entityManager.persist(article);
//    }
//
//    public void delete(int id){
//        Article article = entityManager.find(Article.class, id);
//        entityManager.remove(article);
//    }
}
