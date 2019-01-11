package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class LpService {
    @Inject
    private LpRepository lpRepository;

    @Inject
    RatingRepository ratingRepository;

    public Lp findLpById(int id) {
        return lpRepository.findById(id);
    }

    public List<Lp> findAllLps() {
        return lpRepository.findAll();
    }

//    public Lp findLpByTitle(String title) {
//        return lpRepository.findByTitle(title);
//    }

    public void updateTitle(int id, String newTitle) {
        Lp lp = lpRepository.findById(id);
        lp.setTitle(newTitle);
    }

    public void insert(Lp lp) {
        lpRepository.insert(lp);
    }

    public void delete(Lp lp){
        ratingRepository.deleteByArticle(lp);
        lpRepository.delete(lp.getId());
    }

    public void update(Lp lp){
        lpRepository.update(lp);
    }
}
