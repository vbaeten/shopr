package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.service.RatingService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class RatingController
{
    @Inject
    RatingService ratingService;




}
