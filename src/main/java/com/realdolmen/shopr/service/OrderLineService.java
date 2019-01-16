package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OrderLineService {

    @Inject
    private OrderLineRepository orderLineRepository;

    public OrderLine findOrderLineById(int id) {
        return orderLineRepository.findById(id);
    }

    public List<OrderLine> findOrderLinesByUser (User user) {
        return orderLineRepository.findByUser(user);
    }

    public List<OrderLine> findAllOrderLines() {
        return orderLineRepository.findAll();
    }

    public List<OrderLine> findOrderLinesByShoppingCart (ShoppingCart shoppingCart) {
        return orderLineRepository.findByShoppingCart(shoppingCart);
    }

    public void insertOrderLine(OrderLine orderLine) {
        orderLineRepository.insertOrderLine(orderLine);
    }

    public void sendToOrder(int id, Order order) {
        OrderLine orderline = orderLineRepository.findById(id);
        orderline.setOrder(order);
        orderline.setShoppingCart(null);
    }


    public void deleteOrderLine(int id) {
        orderLineRepository.deleteOrderLine(id);
    }

    public void removeOrderLine(OrderLine orderLine) {orderLineRepository.removeOrderLine(orderLine);}
}
