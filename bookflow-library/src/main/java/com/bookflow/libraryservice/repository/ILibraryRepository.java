package com.bookflow.libraryservice.repository;

import com.bookflow.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibraryRepository extends CrudRepository<Book, String> {

    @Query("SELECT b FROM Book b WHERE b.isbn = :isbn")
    Book findByISBN(@Param("isbn") String isbn);

}
