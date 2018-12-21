package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.SupplierOrder;
import com.realdolmen.shopr.exception.SupplierException;

import javax.ejb.Stateless;

@Stateless
public class SupplierService {

    public void order(SupplierOrder order) throws SupplierException {
        if (shouldThrowException(order.getTotalPrice())) {
            throw new SupplierException();
        }

        // Negeer onderstaande code even...
        System.out.println(order.getOrderId()
                + "-" + order.getTotalPrice()
                + "-" + order.getSupplierOrderType()
                + "-" +order.getSummary());
    }

    protected boolean shouldThrowException(double price) {
        return Math.floor(price)%2 == 0;
    }
}
