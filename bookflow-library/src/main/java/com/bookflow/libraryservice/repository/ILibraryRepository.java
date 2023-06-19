package com.bookflow.libraryservice.repository;

import com.bookflow.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibraryRepository extends CrudRepository<Book, String> {

    Book findByISBN(String isbn);

}
