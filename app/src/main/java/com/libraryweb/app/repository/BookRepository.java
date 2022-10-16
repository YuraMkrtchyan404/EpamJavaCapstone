package com.libraryweb.app.repository;

import com.libraryweb.app.entity.Book;
import com.libraryweb.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// JpaRepository already inherits the @Repository annotation
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT Book FROM Book book WHERE book.Title LIKE %?1%")
    public List<Book> search(String keyword);
}
