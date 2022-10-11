create table if not exists Users
(
    UserID    int(6) primary key auto_increment,
    FirstName varchar(20)   not null,
    LastName  varbinary(20) not null,
    Email     varchar(60)   not null,
    Number    varchar(20)
);

create table if not exists Reservations
(
    ReservationID   int(6) primary key auto_increment,
    ReservationDate date                    not null,
    UserID          int(6) references Users,
    BookID          int(6) references Books,
    ExpireDate      date                    not null
);

create table if not exists Books
(
    BookID          int(6) primary key auto_increment,
    Title           varchar(200),
    GenreID         int(6) references Books,
    AuthorID        int(6) references Authors,
    StatusAvailable boolean,
    Description     varchar(200)
);

create table if not exists BooksGenres
(
    BookID  int(6) references Books  ,
    GenreID int(6) references Genres
);

create table if not exists Genres
(
    GenreID   int(6) primary key auto_increment,
    GenreName varchar(60) not null
);

create table if not exists Authors
(
    AuthorID  int(6) primary key auto_increment,
    FirstName varchar(20) not null,
    LastName  varchar(20) not null,
    BirthYear year        not null,
    DeathYear year        not null
);

create table if not exists BooksAuthors
(
    BookID   int(6) not null,
    AuthorID int(6) not null
);