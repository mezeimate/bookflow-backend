package com.bookflow.libraryservice.common;

import jakarta.enterprise.inject.Vetoed;

@Vetoed
public class LibraryPath {

    public static final String BOOK_REST_BASE_PATH = "/book";
    public static final String ID = "/{id}";

    public static final String PATH_PARAM_ID = "id";

}
