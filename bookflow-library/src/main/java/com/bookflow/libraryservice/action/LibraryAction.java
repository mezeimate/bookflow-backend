package com.bookflow.libraryservice.action;

import com.bookflow.libraryservice.service.AuthorService;
import com.bookflow.libraryservice.service.BookService;
import com.bookflow.model.Author;
import com.bookflow.model.Book;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.OffsetDateTime;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Dependent
public class LibraryAction {

    @Inject
    BookService bookService;

    @Inject
    AuthorService authorService;

    @Transactional
    public Book getBookByISBN(String isbn) {
//        Book byAuthor = libraryService.findByAuthor("John Green");
//        Validate.notNull(byAuthor, "");
        Author a = new Author();
        a.setName("MATE");
        authorService.persist(a);


        Book book = new Book();
        book.setIsbn("222");
        book.setAuthor(a);
        book.setTitle("CIM");
        book.setLoanablePiece(0);
        book.setBorrowedPiece(1);
        book.setPublicationYear(OffsetDateTime.now());

        bookService.persist(book);

        return bookService.findByISBN(isbn);
    }
}
