/*
package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.SupplierOrder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SupplierServiceTest {

    private SupplierService service;

    @Before
    public void init() {
        service = new SupplierService();
    }

    @Test
    public void testShouldThrowException() {
        testShouldThrowException(0,true);
        testShouldThrowException(1,false);
        testShouldThrowException(2,false);
        testShouldThrowException(3,true);
        testShouldThrowException(4,false);
        testShouldThrowException(5,false);
        testShouldThrowException(6,true);
        testShouldThrowException(7,false);
        testShouldThrowException(8,false);
        testShouldThrowException(9,true);
        testShouldThrowException(10,false);
        testShouldThrowException(11,false);
        testShouldThrowException(12,true);
    }

    private void testShouldThrowException(int numberOfArticles, boolean shouldTrowException) {
        SupplierOrder order = new SupplierOrder() {

            @Override
            public String getClientReference() {
                return null;
            }

            @Override
            public String getArticleId() {
                return null;
            }

            @Override
            public int getNumberOfArticles() {
                return numberOfArticles;
            }
        };
        Assert.assertEquals(shouldTrowException, service.shouldThrowException(order));

    }

}*/
