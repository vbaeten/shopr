package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.service.RatingService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class AdminConsoleController
{
@Inject
    RatingService ratingService;


private boolean ratingPaneel = false;
    List<Beoordeling> ratingsUser = new ArrayList<>();

    public List<Beoordeling> getRatingsUser()
    {
        return ratingsUser;
    }

    public void setRatingsUser(List<Beoordeling> ratingsUser)
    {
        this.ratingsUser = ratingsUser;
    }

    public boolean isRatingPaneel()
    {
        return ratingPaneel;
    }

    public void setRatingPaneel(boolean ratingPaneel)
    {
        this.ratingPaneel = ratingPaneel;
    }

    public void ratingsUsers(int id)
    {
        ratingPaneel = true;
        ratingsUser = ratingService.findAllBeoordelingenByUserId(id);
    }
}
