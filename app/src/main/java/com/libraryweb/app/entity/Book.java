package com.libraryweb.app.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BookID;

    @Column(name = "Title")
    private String Title;

    @ManyToMany
    @JoinTable(
            name = "booksgenres",
            joinColumns = @JoinColumn(name = "BookID", referencedColumnName = "BookID"),
            inverseJoinColumns = @JoinColumn(name = "GenreID", referencedColumnName = "GenreID")
    )
    private Set<Genre> Genres;

    @ManyToMany
    @JoinTable(
            name = "booksauthors",
            joinColumns = @JoinColumn(name = "BookID", referencedColumnName = "BookID"),
            inverseJoinColumns = @JoinColumn(name = "AuthorID", referencedColumnName = "AuthorID")
    )
    private Set<Author> Authors;

    @Column(name = "StatusAvailable")
    private Boolean StatusAvailable;

    @Column(name = "Description")
    private String Description;

    public Book() {
    }

    public Book(String title, Set<Genre> genres, Set<Author> authors, Boolean statusAvailable, String description) {
        Title = title;
        Genres = genres;
        Authors = authors;
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

    public Set<Genre> getGenres() {
        return Genres;
    }

    public void setGenres(Set<Genre> genres) {
        Genres = genres;
    }

    public Set<Author> getAuthors() {
        return Authors;
    }

    public void setAuthors(Set<Author> authors) {
        Authors = authors;
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
