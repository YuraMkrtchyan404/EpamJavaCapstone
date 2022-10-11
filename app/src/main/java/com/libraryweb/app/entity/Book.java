package com.libraryweb.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BookID;
    @Column(name = "Title")
    private String Title;
    @ManyToMany(targetEntity = Genre.class)
    private Long GenreID;
    @ManyToMany(targetEntity = Author.class)
    private Long AuthorID;
    @Column(name = "StatusAvailable")
    private Boolean StatusAvailable;
    @Column(name = "Description")
    private String Description;

    public Book() {
    }

    public Book(String title, Long genreID, Long authorID, Boolean statusAvailable, String description) {
        Title = title;
        GenreID = genreID;
        AuthorID = authorID;
        StatusAvailable = statusAvailable;
        Description = description;
    }

    public Long getBookID() {
        return BookID;
    }

    public void setBookID(Long bookID) {
        BookID = bookID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Long getGenreID() {
        return GenreID;
    }

    public void setGenreID(Long genreID) {
        GenreID = genreID;
    }

    public Long getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(Long authorID) {
        AuthorID = authorID;
    }

    public Boolean getStatusAvailable() {
        return StatusAvailable;
    }

    public void setStatusAvailable(Boolean statusAvailable) {
        StatusAvailable = statusAvailable;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
