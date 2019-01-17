package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.repository.RatingRepository;
import com.realdolmen.shopr.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class RatingService
{
    @Inject
    RatingRepository ratingRepository;

    @Inject
    UserRepository userRepository;

    public List<Beoordeling> ratingUser = new ArrayList<>();

    public List<Beoordeling> findAllBeoordelingenByUserId(int id)
    {
        return ratingRepository.findAllBeoordelingenByUser(id);
    }

    public List<Beoordeling> findAllBeoordelingen()
    {
        return ratingRepository.findAllBeoordelingen();
    }
    public void update(Beoordeling b)
    {
        ratingRepository.update(b);
    }

    public void insert(Beoordeling beoordeling)
    {
        ratingRepository.insert(beoordeling);
    }

    public List<Beoordeling> beoordelingenBepaaldArtikel(int id)
    {
        return ratingRepository.findBeoordelingenBepaaldArtikel(id);
    }

    public void delete(Beoordeling b)
    {
        ratingRepository.delete(b);
    }

    public void deleteRatingsUser(int id)
    {
        ratingUser = findAllBeoordelingenByUserId(id);
        for (Beoordeling b: ratingUser)
        {
            this.delete(b);
        }
    }
}
