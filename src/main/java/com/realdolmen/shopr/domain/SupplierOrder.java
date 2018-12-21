package com.realdolmen.shopr.domain;

public interface SupplierOrder {

    String getOrderId();
    String getSummary();
    double getTotalPrice();
    SupplierOrderType getSupplierOrderType();
}
