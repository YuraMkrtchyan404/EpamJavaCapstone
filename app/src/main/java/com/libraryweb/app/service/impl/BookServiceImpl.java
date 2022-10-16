package com.libraryweb.app.service.impl;

import com.libraryweb.app.entity.Book;
import com.libraryweb.app.repository.BookRepository;
import com.libraryweb.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> findAllBooks(String keyword) {
        if (keyword != null){
            return bookRepository.search(keyword);
        }
        return bookRepository.findAll();
    }
}
