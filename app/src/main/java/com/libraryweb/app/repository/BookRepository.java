package com.libraryweb.app.repository;

import com.libraryweb.app.entity.Book;
import com.libraryweb.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT book FROM Book book WHERE book.Title LIKE %?1% OR book.Description LIKE %?1%")
    public List<Book> search(String keyword);

//    public abstract List<Book> findBooksByTitleContainingOrDescriptionContaining(String title, String description);
}
