package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {


    @InjectMocks
    private BookService bookService;
    @Mock
    private BookRepository bookRepository;

    private List<Book> books = new ArrayList<>();
    private Book book;
    private Book book2;


    public void init(){

        book = new Fiction();
        book2= new NonFiction();
        books.add(book);
        books.add(book2);
    }

    @Test
    public void findAllBooks() {

        Mockito.when(bookRepository.findAllBooks()).thenReturn(books);
        List<Book> resultList = bookService.findAllBooks();
        assertEquals(resultList,books);
        verify(bookRepository,times(1)).findAllBooks();
    }
}