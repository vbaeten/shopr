package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class CartBean {

    private User loggedUser;
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();

    public void add(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public void remove(OrderLine orderLine) {
        orderLines.remove(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
