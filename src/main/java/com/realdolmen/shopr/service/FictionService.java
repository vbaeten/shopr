package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.repository.FictionRepository;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FictionService {
    @Inject
    private FictionRepository fictionRepository;

    @Inject
    private RatingRepository ratingRepository;

    public Fiction findFictionById(int id) {
        return fictionRepository.findById(id);
    }

    public List<Fiction> findAllFictions() {
        return fictionRepository.findAll();
    }

//    public Fiction findFictionByTitle(String title) {
//        return fictionRepository.findByTitle(title);
//    }
//
//    public void updateTitle(int id, String newTitle) {
//        Fiction fiction = fictionRepository.findById(id);
//        fiction.setTitle(newTitle);
//    }

    public void insert(Fiction fiction) {
        fictionRepository.insert(fiction);
    }

    public void delete(Fiction fiction){
        ratingRepository.deleteByArticle(fiction);
        fictionRepository.delete(fiction.getId());
    }

    public void update(Fiction fiction){
        fictionRepository.update(fiction);
    }
}
