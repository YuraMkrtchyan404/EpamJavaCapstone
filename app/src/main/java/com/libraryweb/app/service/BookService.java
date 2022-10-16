package com.libraryweb.app.service;


import com.libraryweb.app.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAllBooks(String keyword);
}
