package com.realdolmen.shopr.domain;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ShoppingCart {
    public void orderedLines(List<OrderLine> list);
}
