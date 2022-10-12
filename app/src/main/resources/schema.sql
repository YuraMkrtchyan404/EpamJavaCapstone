create table if not exists Books
(
    BookID          int(6) auto_increment,
    Title           varchar(200),
    GenreID         int(6),
    AuthorID        int(6),
    StatusAvailable boolean,
    Description     varchar(200),
    PRIMARY KEY (BookID),
    FOREIGN KEY (GenreID) REFERENCES BooksGenres (GenreID),
    FOREIGN KEY (AuthorID) REFERENCES BooksAuthors (AuthorID)
);