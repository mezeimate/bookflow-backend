package com.bookflow.libraryservice.repository;

import com.bookflow.model.Book;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface ILibraryRepository extends EntityRepository<Book, String> {

    @Query("SELECT b FROM Book b WHERE b.isbn = :isbn")
    Book findByISBN(String isbn);

}
