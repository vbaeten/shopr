package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.repository.NonFictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class NonFictionService {

    @Inject
    private NonFictionRepository nonFictionRepository;


    public NonFiction findById(int id) {
        return nonFictionRepository.findById(id);
    }

    public List<NonFiction> findAll() {
        return nonFictionRepository.findAll();
    }

    public NonFiction findByTitle(String title) {
        return nonFictionRepository.findByTitle(title);
    }

    public void updateTitle(int id, String newTitle) {
        NonFiction nonFiction = nonFictionRepository.findById(id);
        nonFiction.setTitle(newTitle);
    }

    public void insert(NonFiction nonFiction) {
        nonFictionRepository.insert(nonFiction);
    }

    public void removeById(int id) {
        nonFictionRepository.remove(id);
    }
}
