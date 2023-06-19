CREATE TABLE BOOK (
    ISBN                VARCHAR(13)     PRIMARY KEY NOT NULL COMMENT 'International Standard Book Number',
    TITLE               VARCHAR(255)    NOT NULL COMMENT 'Book title',
    AUTHOR              VARCHAR(100)    NOT NULL COMMENT 'Book author',
    PUBLICATION_YEAR    TIMESTAMP       NULL COMMENT 'Book release date',
    LOANABLE_PIECE      int             NOT NULL DEFAULT 0 COMMENT 'Loanable book piece',
    BORROWED_PIECE      int             NOT NULL DEFAULT 0 COMMENT 'Borrowed book piece'
);