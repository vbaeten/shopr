package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Bestelling;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class BestellingsRepository
{
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Bestelling findById(int id) {
        return entityManager.find(Bestelling.class, id);
    }

    public List<Bestelling> findByUser(int id)
    {
        Query a = entityManager.createQuery("select b from Bestelling b where b.user.id =:id ");
        a.setParameter("id", id);
        return a.getResultList();
    }

//    public List<Bestelling> findAll() {
//        return entityManager.createNamedQuery(Bestelling.FIND_ALL, Bestelling.class).getResultList();
//    }
//


    public void insert(Bestelling bestelling) {
        entityManager.persist(bestelling);
    }

    public void delete (Bestelling bestelling )
    {
        entityManager.remove(bestelling);
    }

    public void update(Bestelling bestelling)
    {
        entityManager.merge(bestelling);
    }

    public List<Bestelling> bestellingenJoinFetch(int id)
    {

        Query q = entityManager.createQuery(
                "select b " +
                        "from Bestelling b " +
                        "join fetch b.artikels " +
                        "where b.user.id = :id", Bestelling.class);
                q.setParameter("id", id);
                return q.getResultList();

    }
}
