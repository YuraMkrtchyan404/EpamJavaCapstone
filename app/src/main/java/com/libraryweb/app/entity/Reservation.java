package com.libraryweb.app.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ReservationID;

    @Column(name = "ReservationDate", nullable = false)
    private Date ReservationDate;

    @JoinColumn(name = "UserID")
    @ManyToOne(cascade = CascadeType.ALL)
    private User User;

    @JoinColumn(name = "BookID")
    @ManyToOne(cascade = CascadeType.ALL)
    private Book Book;

    @Column(name = "ExpireDate", nullable = false)
    private Date ExpireDate;

    public Reservation(Date ReservationDate, User User, Book Book, Date ExpireDate) {
        this.ReservationDate = ReservationDate;
        this.User = User;
        this.Book = Book;
        this.ExpireDate = ExpireDate;
    }

    public Reservation() {
    }

    public Long getReservationID() {
        return ReservationID;
    }

    public void setReservationID(Long reservationID) {
        ReservationID = reservationID;
    }

    public Date getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        ReservationDate = reservationDate;
    }

    public com.libraryweb.app.entity.User getUser() {
        return User;
    }

    public void setUser(com.libraryweb.app.entity.User user) {
        User = user;
    }

    public com.libraryweb.app.entity.Book getBook() {
        return Book;
    }

    public void setBook(com.libraryweb.app.entity.Book book) {
        Book = book;
    }

    public Date getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(Date expireDate) {
        ExpireDate = expireDate;
    }
}
