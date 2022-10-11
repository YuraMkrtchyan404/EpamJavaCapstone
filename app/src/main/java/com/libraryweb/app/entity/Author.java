package com.libraryweb.app.entity;

import javax.persistence.*;
import java.time.Year;

@Entity
@Table(name = "Authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long AuthorID;
    @Column(name = "FirstName", nullable = false)
    private String FirstName;
    @Column(name = "LastName", nullable = false)
    private String LastName;
    @Column(name = "BirthYear", nullable = false)
    private Year BirthYear;
    @Column(name = "DeathYear", nullable = false)
    private Year DeathYear;

    public Author(String firstName, String lastName, Year birthYear, Year deathYear) {
        FirstName = firstName;
        LastName = lastName;
        BirthYear = birthYear;
        DeathYear = deathYear;
    }

    public Author() {
    }

    public Long getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(Long authorID) {
        AuthorID = authorID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Year getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(Year birthYear) {
        BirthYear = birthYear;
    }

    public Year getDeathYear() {
        return DeathYear;
    }

    public void setDeathYear(Year deathYear) {
        DeathYear = deathYear;
    }
}
