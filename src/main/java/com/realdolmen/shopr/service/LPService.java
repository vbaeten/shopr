package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.CrudRepository;
import com.realdolmen.shopr.repository.LPRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
@Stateless
public class LPService extends CrudService<LP, Long>{
    @Inject
    private LPRepository lPRepository;

    @Override
    CrudRepository<LP, Long> getRepository() {
        return lPRepository;
    }
}
