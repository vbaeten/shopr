package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.OrderLineRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.persistence.criteria.Order;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderLineServiceTest {


    @InjectMocks
    private OrderLineService orderLineService;
    @Mock
    private OrderLineRepository orderLineRepository;

    private int id;
    private List<OrderLine> orderLines = new ArrayList<>();
    private OrderLine orderLine;
    private OrderLine orderLine2;

    public void init(){

        id=1;
        orderLine = new OrderLine();
        orderLine2= new OrderLine();
        orderLines.add(orderLine);
        orderLines.add(orderLine2);
    }


    @Test
    public void findById() {

        Mockito.when(orderLineRepository.findById(id)).thenReturn(orderLine);
        OrderLine result = orderLineService.findById(id);
        assertEquals(result,orderLine);
        Mockito.verify(orderLineRepository,Mockito.times(1)).findById(id);
    }

    @Test
    public void submit() {

        orderLineService.submit(orderLine);
        Mockito.verify(orderLineRepository,Mockito.times(1)).submit(orderLine);
    }

    @Test
    public void getOrderLines() {

        Mockito.when(orderLineRepository.findAllOrderLines()).thenReturn(orderLines);
        List<OrderLine> resultList = orderLineService.getOrderLines();
        assertEquals(resultList,orderLines);
        Mockito.verify(orderLineRepository,Mockito.times(1)).findAllOrderLines();
    }
}