CREATE TABLE AUTHOR
(

    ID   VARCHAR(40) PRIMARY KEY NOT NULL COMMENT 'Author primary key',
    NAME VARCHAR(100) NOT NULL COMMENT 'Author name'

) ENGINE = InnoDb;


CREATE TABLE BOOK
(

    ISBN             VARCHAR(13) PRIMARY KEY NOT NULL COMMENT 'International Standard Book Number',
    TITLE            VARCHAR(255)            NOT NULL COMMENT 'Book title',
    AUTHOR_ID        VARCHAR(40)                     NOT NULL COMMENT 'Book author key',
    PUBLICATION_YEAR DATE NULL COMMENT 'Book release date',
    LOANABLE_PIECE   int                     NOT NULL DEFAULT 0 COMMENT 'Loanable book piece',
    BORROWED_PIECE   int                     NOT NULL DEFAULT 0 COMMENT 'Borrowed book piece',

    CONSTRAINT FK_AUTHOR FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR (ID)

);

INSERT INTO AUTHOR (ID, NAME)
VALUES (1, 'J.R.R. Tolkien'),
       (2, 'Paulo Coelho'),
       (3, 'J.K. Rowling'),
       (4, 'Don Miguel Ruiz'),
       (5, 'John Green'),
       (6, 'F. Scott Fitzgerald'),
       (7, 'Harper Lee'),
       (8, 'George Orwell'),
       (9, 'Jane Austen'),
       (10, 'J.D. Salinger'),
       (11, 'Agatha Christie'),
       (12, 'Leo Tolstoy'),
       (13, 'Fyodor Dostoevsky'),
       (14, 'Gabriel Garcia Marquez'),
       (15, 'Ernest Hemingway');

INSERT INTO BOOK (ISBN, TITLE, AUTHOR_ID, PUBLICATION_YEAR, LOANABLE_PIECE, BORROWED_PIECE)
VALUES ('9780061120084', 'The Hobbit', 1, '1937-01-01', 0, 0),
       ('9780062315007', 'The Alchemist', 2, '1988-01-01', 0, 0),
       ('9780547928227', 'Harry Potter and the Sorcerer''s Stone', 3, '1997-01-01', 0, 0),
       ('9780062457714', 'The Four Agreements', 4, '1997-01-01', 0, 0),
       ('9780142424179', 'The Fault in Our Stars', 5, '2012-01-01', 0, 0),
       ('9780743273565', 'The Great Gatsby', 6, '1925-01-01', 0, 0),
       ('9780060935467', 'To Kill a Mockingbird', 7, '1960-01-01', 0, 0),
       ('9780451524935', '1984', 8, '1949-01-01', 0, 0),
       ('9780141439518', 'Pride and Prejudice', 9, '1813-01-01', 0, 0),
       ('9780316769488', 'The Catcher in the Rye', 10, '1951-01-01', 0, 0),
       ('9780007119318', 'Murder on the Orient Express', 11, '1934-01-01', 0, 0),
       ('9780143035008', 'Anna Karenina', 12, '1877-01-01', 0, 0),
       ('9780374528379', 'Crime and Punishment', 13, '1866-01-01', 0, 0),
       ('9780060932664', 'One Hundred Years of Solitude', 14, '1967-01-01', 0, 0),
       ('9780684801223', 'The Old Man and the Sea', 15, '1952-01-01', 0, 0);