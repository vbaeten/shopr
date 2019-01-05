package com.realdolmen.shopr.service;

import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class OrderLineService {
    @Inject
    OrderLineRepository orderLineRepository;
}
