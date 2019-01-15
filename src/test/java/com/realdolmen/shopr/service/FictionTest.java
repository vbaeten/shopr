package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.repository.FictionRepository;
import com.realdolmen.shopr.repository.RatingRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class FictionTest {
    @InjectMocks
    FictionService fictionService;

    @Mock
    FictionRepository fictionRepository;

    @Mock
    RatingRepository ratingRepository;

    Fiction fiction;
    Fiction fiction2;

    @Before
    public void init(){
        fiction = new Fiction();
        fiction.setId(1);
        fiction2 = new Fiction();
        fiction2.setId(2);
    }

    @Test
    public void testInsert(){
        doNothing().when(fictionRepository).insert(fiction);
        fictionService.insert(fiction);
        verify(fictionRepository, times(1)).insert(fiction);
    }

    @Test
    public void testDelete(){
        doNothing().when(fictionRepository).delete(1);
        fictionService.delete(fiction);
        verify(fictionRepository, times(1)).delete(1);
    }

    @Test
    public void testFindFictionById(){
        when(fictionRepository.findById(1)).thenReturn(fiction);
        Fiction checkedFiction = fictionService.findFictionById(1);
        assertEquals(checkedFiction, fiction);
    }

    @Test
    public void testUpdate(){
        when(fictionRepository.findById(1)).thenReturn(fiction);
        fictionService.update(fiction);
        verify(fictionRepository, times(1)).update(fiction);
    }

    @Test
    public void testFindAllFictions(){
        when(fictionRepository.findAll()).thenReturn(Arrays.asList(fiction,fiction2));
        List<Fiction> expectedFictionList = fictionService.findAllFictions();
        Assert.assertEquals(expectedFictionList, Arrays.asList(fiction, fiction2));
    }



}
