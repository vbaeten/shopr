package com.realdolmen.shopr.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CriteriaRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager em;

    public <T> List<T> findByCriteria(final Class type) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(type);
        Root<T> searchRoot = cq.from(type);
        TypedQuery<T> q = em.createQuery(cq.select(searchRoot));
        return q.getResultList();
    }
}
