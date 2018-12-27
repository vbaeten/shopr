package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.LPRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class LPService {

    @Inject
    private LPRepository lpRepository = new LPRepository();


    public void insert(LP lp)
    {
        this.lpRepository.insert(lp);
    }

    public List<LP> findAllLps() {
        return lpRepository.findAllLps();
    }


}
