package com.bookflow.libraryservice.action;

import com.bookflow.dto.PostBookRequest;
import com.bookflow.libraryservice.service.AuthorService;
import com.bookflow.libraryservice.service.BookService;
import com.bookflow.model.Book;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;

/**
 * @since 0.0.1-SNAPSHOT
 * @author mezeim
 */
@Dependent
public class BookAction {

    @Inject
    BookService bookService;

    @Inject
    AuthorService authorService;

    @Inject
    ModelMapper modelMapper;

    public Book getBook(String isbn) {
        return bookService.findByISBN(isbn);
    }

    @Transactional
    public Book postBook(PostBookRequest postBookRequest) {
        //Author author = authorService.findById(postBookRequest.getAuthorId());

        //Book book = modelMapper.map(postBookRequest, Book.class);
        Book book = new Book();
        //book.setAuthor(author);
        //bookService.persistAndFlush(book);
        return book;
    }
}
