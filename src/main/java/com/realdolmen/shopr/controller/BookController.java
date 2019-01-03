package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.service.BookService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;
@ManagedBean
@RequestScoped
public class BookController {
    Book book;
    @Inject
    BookFictionController bookFictionController;
    @Inject
    BookService bookService;

    public Book getBook() { return  this.book;}

    public void setBook(Book book){
        this.book = book;
    }
//    public String getBookTypeById(Long id) {return this.bookService.findBookById(id).getBooktype();}
    public List<Book> getBooks(){
        return this.bookService.findAllBooks();
    }
    public Book getBookbyId(Long id) {
       return bookService.findBookById(id);
    }
    public void add(Book book){
        this.bookService.insert(book);
    }
}
