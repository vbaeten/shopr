package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ShoppingCartImpl implements ShoppingCart {

    @Override
    public void orderedLines(List<OrderLine> list) {

    }
}
