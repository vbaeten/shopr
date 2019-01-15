package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.OrderLineRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class OrderLineServiceTest {
    @Mock
    OrderLineRepository orderLineRepository;

    @InjectMocks
    OrderLineService orderLineService;

    List<OrderLine> orderLineList;
    OrderLine orderLine1;
    OrderLine orderLine2;

    @Before
    public void init() {
        orderLineList = new ArrayList<>();

        //  OrderLine 1
        orderLine1 = new OrderLine();


        //  OrderLine 2
        orderLine2 = new OrderLine();


        orderLineList.add(orderLine1);
        orderLineList.add(orderLine2);
    }

    @Test
    public void testOrderLineRepositoryFindAll() {
        when(orderLineRepository.findAll()).thenReturn(this.orderLineList);
        assertEquals("size should be 2", 2, orderLineList.size());

    }

    @Test
    public void testOrderLineRepositoryRemove() {
        doNothing().when(orderLineRepository).remove(orderLine1);
        orderLineRepository.remove(orderLine1);
        verify(orderLineRepository, times(1)).remove(orderLine1);
    }

    @Test
    public void testOrderLineRepositoryInsert() {
        when(orderLineRepository.insert(orderLine1)).thenReturn(orderLine1);
        orderLineService.insert(orderLine1);
        verify(orderLineRepository, times(1)).insert(orderLine1);
    }

    @Test
    public void testOrderLineRepositoryFindById() {
        Long primaryKey = 1L;
        when(orderLineRepository.findByPrimaryKey(primaryKey)).thenReturn(orderLine1);
        OrderLine orderLineById = orderLineService.findByPrimaryKey(primaryKey);
        assertEquals("orderLineById is orderLine1", orderLine1, orderLineById);
    }

    @Test
    public void testOrderLineRepositoryUpdate() {
        when(orderLineRepository.findByPrimaryKey(1L)).thenReturn(orderLine1);
        orderLineService.update(orderLine1);
        verify(orderLineRepository, times(1)).update(orderLine1);
    }
}