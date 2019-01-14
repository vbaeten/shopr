//package com.realdolmen.shopr.controller;
//
//import com.realdolmen.shopr.domain.Book;
//
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.inject.Inject;
//import java.util.List;
//@ManagedBean
//@ViewScoped
//public class BookController {
//    Book book;
//    @Inject
//    BookFictionController bookFictionController;
//    @Inject
//    BookService bookService;
//
//    public Book getBook() { return  this.book;}
//
//    public void setBook(Book book){
//        this.book = book;
//    }
//    public List<Book> getBooks(){
//        return this.bookService.findAllBooks();
//    }
//    public Book getBookbyId(Long id) {
//       return bookService.findBookById(id);
//    }
//    public void add(Book book){
//        this.bookService.insert(book);
//    }
//}
