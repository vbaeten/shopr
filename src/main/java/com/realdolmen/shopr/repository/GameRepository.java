package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GameRepository extends CrudRepository<Game, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
//    public Game findByArticleId(Long articleId) {
//        return entityManager.find(Game.class, articleId);
//    }
//
//    public List<Game> findAll() {
//        return entityManager.createQuery("select f from Game f ", Game.class).getResultList();
//    }
//
//    public Game findByTitle(String title) {
//        return entityManager.createQuery(" select f from Game f where f.title =: title", Game.class).getSingleResult();
//    }
//
//    public void insert(Game game) {entityManager.persist(game);
//    }
//
//    public void update(Game game) {entityManager.merge(game);}
//
//    public void remove(Game game) {
//        entityManager.remove(game);}
}
