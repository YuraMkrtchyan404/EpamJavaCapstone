package com.libraryweb.app.service;


import com.libraryweb.app.entity.Book;
import com.libraryweb.app.entity.Reservation;
import com.libraryweb.app.entity.User;

import java.util.List;

public interface BookService {

    List<Book> getBooksByTitle(String keyword);

    List<Book> getAllBooks();

    Reservation reserveBook(Book book);
    Book getBookByID(Long id);

    User getUserByID(Long id);
}
