package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.service.GameService;
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
public class GameControllerTest {
    @InjectMocks
    GameController gameController;

    @Mock
    GameService gameService;

    @Mock
    FacesContext facesContext;

    @Before
    public void init(){
        PowerMockito.mockStatic(FacesContext.class);
        when(FacesContext.getCurrentInstance()).thenReturn(facesContext);
    }

    @Test
    public void testSubmit(){
        gameController.submit();
        verify(gameService, times(1)).insert(any());
        Assert.assertEquals(0, gameController.newGame.getId());
    }

    @Test
    public void testDelete(){
        String result = gameController.delete();
        Assert.assertEquals("gamesDataTable?faces-redirect=true", result);
        Assert.assertEquals(0, gameController.newGame.getId());
    }

}
