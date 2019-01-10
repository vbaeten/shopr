package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Stateless
public class OrderService implements Serializable {
    @Inject
    private OrderRepository orderRepository;

    public Order findOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public void insert(Order order) {
        orderRepository.insert(order);
    }

    public void update(Order order) {
        orderRepository.update(order);
    }

    public void delete(Long id) {
        Order order = orderRepository.findById(id);
        orderRepository.delete(order);
    }

    public Order getCorrectOrderInstance(Order order, User currentUser) {
        order = getUnconfirmedOrderByCurrentUser(currentUser);
        if (order == null) {
            order = createNewOrderAndSetUser(currentUser);
            insert(order);
        }
        return order;
    }

    private Order getUnconfirmedOrderByCurrentUser(User currentUser) {
        List<Order> orders = findOrdersByUserId(currentUser.getId());
        if (orders.size() == 0) {
            return null;
        } else {
            Order newOrder = new Order();
            for (Order order : orders) {
                if (!order.getConfirmed()) {
                    return order;
                } else {
                    newOrder = createNewOrderAndSetUser(currentUser);
                }
            }
            return newOrder;
        }
    }

    private List<Order> findOrdersByUserId(Long id) {
        return orderRepository.findOrdersByUserId(id);
    }

    public Order createNewOrderAndSetUser(User currentUser) {
        Order newOrder = new Order();
        newOrder.setUser(currentUser);
        insert(newOrder);
        return newOrder;
    }

    public void confirmOrder(Order order) {
        order.setConfirmed(true);
        update(order);
    }

    public Double calculateOrderTotalPrice(List<OrderLine> orderLines) {
        Double total = 0D;
        for (OrderLine orderLine : orderLines) {
            Double orderLineTotalPrice = orderLine.getAmount() * orderLine.getItem().getPrice();
            total += orderLineTotalPrice;
        }
        return total;
    }
}
