package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.repository.FictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FictionService {
    @Inject
    private FictionRepository fictionRepository;

    public Fiction findFictionById(int id) {
        return fictionRepository.findById(id);
    }

    public List<Fiction> findAllFictions() {
        return fictionRepository.findAll();
    }

    public Fiction findFictionByTitle(String title) {
        return fictionRepository.findByTitle(title);
    }

    public void updateTitle(int id, String newTitle) {
        Fiction fiction = fictionRepository.findById(id);
        fiction.setTitle(newTitle);
    }

    public void insert(Fiction fiction) {
        fictionRepository.insert(fiction);
    }

    public void delete(int id){
        fictionRepository.delete(id);
    }

    public void update(Fiction fiction){
        fictionRepository.update(fiction);
    }
}
