package com.libraryweb.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "Genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long GenreID;

    @Column(name = "GenreName", nullable = false)
    private String GenreName;

    public Genre(String genreName) {
        GenreName = genreName;
    }

    public Genre() {
    }

    public Long getGenreID() {
        return GenreID;
    }

    public void setGenreID(Long genreID) {
        GenreID = genreID;
    }

    public String getGenreName() {
        return GenreName;
    }

    public void setGenreName(String genreName) {
        GenreName = genreName;
    }
}
