package com.realdolmen.shopr.service;

import com.realdolmen.shopr.repository.BoekRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class BoekService
{
    @Inject
    BoekRepository boekRepository;




}
