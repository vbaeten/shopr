package com.realdolmen.shopr.service;


        import com.realdolmen.shopr.domain.Beoordeling;
        import com.realdolmen.shopr.repository.RatingRepository;

        import javax.ejb.Stateless;
        import javax.inject.Inject;
        import java.util.List;

@Stateless
public class RatingService
{
    @Inject
    RatingRepository ratingRepository;

    @Inject


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
}
