package com.realdolmen.shopr.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class FlowBeanTest {
    @InjectMocks
    FlowBean flowBean;

    @Test
    public void testGetYearsShouldStartWithCurrentYear(){
        Assert.assertEquals(LocalDate.now().getYear(), flowBean.getYears()[0]);
    }

    @Test
    public void testGetMonthsShouldReturnArrayOf12Elements(){
        Assert.assertEquals(12, flowBean.getMonths().length);
    }

    @Test
    public void testGetMonthShouldReturn12asBiggestelement(){
        Assert.assertEquals(12, flowBean.getMonths()[flowBean.getMonths().length - 1]);
    }
}
