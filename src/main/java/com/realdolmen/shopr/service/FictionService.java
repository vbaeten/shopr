package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.repository.FictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class FictionService {


    @Inject
    private FictionRepository fictionRepository = new FictionRepository();


    public void insert(Fiction newFiction) {
        fictionRepository.insert(newFiction);
    }

    public List<Fiction> findAllFictions() {
        return this.fictionRepository.findAllFictions();
    }



    public Fiction findById(int id) {

        return this.fictionRepository.findById(id);

    }



    public void delete(Fiction toDeleteF) {
        this.fictionRepository.delete(toDeleteF);
    }


    public void update(Fiction fiction) {
        this.fictionRepository.update(fiction);
    }
}
