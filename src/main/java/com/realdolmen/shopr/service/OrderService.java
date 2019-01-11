package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
        }
        return order;
    }

    private Order getUnconfirmedOrderByCurrentUser(User currentUser) {
        List<Order> orders = findOrdersByUserId(currentUser.getId());
        if (orders.size() == 0) {
            return null;
        } else {
            return orders.stream().filter(order -> !order.getConfirmed()).findFirst()
                    .orElseGet(() -> createNewOrderAndSetUser(currentUser));
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
