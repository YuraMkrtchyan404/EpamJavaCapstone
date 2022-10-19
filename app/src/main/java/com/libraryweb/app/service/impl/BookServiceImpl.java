package com.libraryweb.app.service.impl;

import com.libraryweb.app.entity.Book;
import com.libraryweb.app.entity.Reservation;
import com.libraryweb.app.entity.User;
import com.libraryweb.app.repository.BookRepository;
import com.libraryweb.app.repository.ReservationRepository;
import com.libraryweb.app.repository.UserRepository;
import com.libraryweb.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.*;
import java.util.Date;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final UserRepository userRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, UserRepository userRepository, ReservationRepository reservationRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<Book> getBooksByTitle(String keyword) {
        if (keyword != null) {
            return bookRepository.search(keyword);
        }
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    @Override
    public Book getBookByID(Long id) {
        return bookRepository.findById(id).get();
    }


    @Override
    public Reservation reserveBook(Book book) {
        User user = userRepository.findAll().get(0);
        Date now = new Date(System.currentTimeMillis());
        LocalDate expireDateLocalDate = LocalDate.now().plusMonths(1);
        Date expireDate = Date.from(expireDateLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Reservation newReservation = new Reservation();
        newReservation.setBook(book);
        newReservation.setReservationDate(now);
        newReservation.setUser(user);
        newReservation.setExpireDate(expireDate);
        return reservationRepository.save(newReservation);
    }

    @Override
    public User getUserByID(Long id) {
        return userRepository.findById(1L).get();
    }

    @Override
    public List<Reservation> getAllReservations() {
        List<Reservation> reservations = reservationRepository.findAll();
        reservations.sort((reservation1, reservation2) -> (int) (reservation2.getReservationID() - reservation1.getReservationID()));
        return reservations;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
}
