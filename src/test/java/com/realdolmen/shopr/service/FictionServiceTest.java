package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.repository.FictionRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FictionServiceTest {


    @InjectMocks
    private FictionService fictionService;
    @Mock
    private FictionRepository fictionRepository;

    private Fiction fiction;
    private Fiction fiction2;
    private List<Fiction> fictions=new ArrayList<>();
    int id;


    @Before
    public void init(){
        id = 1;
        fiction=new Fiction();
        fiction2 = new Fiction();
        fictions.add(fiction);
        fictions.add(fiction2);
    }

    @Test
    public void insert() {

        fictionService.insert(fiction);
        verify(fictionRepository,times(1)).insert(fiction);

    }

    @Test
    public void findAllFictions() {

        when(fictionRepository.findAllFictions()).thenReturn(fictions);
        List<Fiction> resultList = fictionService.findAllFictions();
        assertEquals(resultList,fictions);
        verify(fictionRepository,times(1)).findAllFictions();
    }

    @Test
    public void findById() {

        int id = fiction.getId();
        when(fictionRepository.findById(id)).thenReturn(fiction);
        Fiction result = fictionService.findById(id);
        assertEquals(result,fiction);
        verify(fictionRepository,times(1)).findById(id);
    }

    @Test
    public void delete() {

        fictionService.delete(fiction);
        verify(fictionRepository,times(1)).delete(fiction);
    }

    @Test
    public void update() {

        fictionService.update(fiction);
        verify(fictionRepository,times(1)).update(fiction);
    }

}