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
    @ManyToOne(targetEntity = User.class)
    private Long UserID;
    @ManyToOne(targetEntity = Book.class)
    private Long BookID;
    @Column(name = "ExpireDate", nullable = false)
    private Date ExpireDate;

    public Reservation(Date ReservationDate, Long UserID, Long BookID, Date ExpireDate) {
        this.ReservationDate = ReservationDate;
        this.UserID = UserID;
        this.BookID = BookID;
        this.ExpireDate = ExpireDate;
    }

    public Reservation() {
    }

    public Long getReservationID() {
        return ReservationID;
    }

    public void setReservationID(Long ReservationID) {
        this.ReservationID = ReservationID;
    }

    public Date getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(Date ReservationDate) {
        this.ReservationDate = ReservationDate;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long UserID) {
        this.UserID = UserID;
    }

    public Long getBookID() {
        return BookID;
    }

    public void setBookID(Long BookID) {
        this.BookID = BookID;
    }

    public Date getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(Date ExpireDate) {
        this.ExpireDate = ExpireDate;
    }
}
