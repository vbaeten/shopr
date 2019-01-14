package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

public class SearchBeanRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public double findMinPrice(){
        return (double) entityManager.createNamedQuery(Article.FIND_MIN_PRICE).getSingleResult();
    }

    public double findMaxPrice(){
        return (double) entityManager.createNamedQuery(Article.FIND_MAX_PRICE).getSingleResult();
    }

    public List<Article> dynamicQuerySearch(Map searchParameters){
        String query = String.format("select a from Article a where (a.price between %s and %s) and (lower(a.title) like lower('%%%s%%'))",
                searchParameters.get("min"), searchParameters.get("max"), searchParameters.get("title"));
        if (!searchParameters.get("id").equals("0")){
            query +=  " and a.id = " + searchParameters.get("id");
        }


        query +=  " order by price";

        return entityManager.createQuery(query).getResultList();
    }

}
