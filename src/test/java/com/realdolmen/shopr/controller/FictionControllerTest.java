package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.service.FictionService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.faces.context.FacesContext;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FacesContext.class)
public class FictionControllerTest {
    @InjectMocks
    FictionController fictionController;

    @Mock
    FictionService fictionService;

    @Mock
    FacesContext facesContext;

    @Before
    public void init(){
        PowerMockito.mockStatic(FacesContext.class);
        when(FacesContext.getCurrentInstance()).thenReturn(facesContext);
    }

    @Test
    public void testSubmit(){
        fictionController.submit();
        verify(fictionService, times(1)).insert(any());
        Assert.assertEquals(0, fictionController.newFiction.getId());
    }

    @Test
    public void testDelete(){
        String result = fictionController.delete();
        Assert.assertEquals("fictionDataTable?faces-redirect=true", result);
        Assert.assertEquals(0, fictionController.newFiction.getId());
    }

}
