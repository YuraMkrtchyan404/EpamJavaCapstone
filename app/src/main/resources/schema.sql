create table Users
(
    UserID    int(6) primary key auto_increment,
    FirstName varchar(20)   not null,
    LastName  varbinary(20) not null,
    Email     varchar(60)   not null,
    Number    varchar(20)
);

create table Reservations
(
    ReservationID   int(6) primary key auto_increment,
    ReservationDate date                    not null,
    UserID          int(6) references Users not null,
    BookID          int(6) references Books not null,
    ExpireDate      date                    not null
);

create table Books
(
    BookID          int(6) primary key auto_increment,
    Title           varchar(200),
    GenreID         int(6) references Books   not null,
    AuthorID        int(6) references Authors not null,
    StatusAvailable boolean                   not null,
    Description     varchar(200)
);

create table BooksGenres
(
    BookID  int(6) references Books  not null,
    GenreID int(6) references Genres not null
);

create table Genres
(
    GenreID   int(6) primary key auto_increment,
    GenreName varchar(60) not null
);

create table Authors
(
    AuthorID  int(6) primary key auto_increment,
    FirstName varchar(20) not null,
    LastName  varchar(20) not null,
    BirthYear year        not null,
    DeathYear year        not null
);

create table BooksAuthors
(
    BookID   int(6) not null,
    AuthorID int(6) not null
);