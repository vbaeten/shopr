package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class LpService {

    @Inject
    private LpRepository lpRepository;

    public Lp findById(int id) {
        return lpRepository.findById(id);
    }

    public List<Lp> findAll() {
        return lpRepository.findAll();
    }

    public Lp findByTitle(String title) {
        return lpRepository.findByTitle(title);
    }

    public void updateTitle(int id, String newTitel) {
        Lp lp = lpRepository.findById(id);
        lp.setTitel(newTitel);
    }

    public void insert(Lp lp) {
        lpRepository.insert(lp);
    }

    public void removeById(int id){
        lpRepository.remove(id);
    }

}
