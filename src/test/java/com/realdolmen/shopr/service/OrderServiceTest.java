package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.repository.OrderRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {
    @InjectMocks
    OrderService orderService;

    @Mock
    OrderRepository orderRepository;

    private Order order;

    @Before
    public void init(){
        order = new Order();
        order.setId(1);
    }

    @Test
    public void testInsert(){
        doNothing().when(orderRepository).insert(order);
        orderService.insert(order);
        verify(orderRepository, times(1)).insert(order);
    }

}
