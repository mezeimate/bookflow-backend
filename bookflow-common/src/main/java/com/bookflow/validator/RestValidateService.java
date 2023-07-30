package com.bookflow.validator;

import jakarta.enterprise.inject.Vetoed;

import java.util.function.Consumer;
import java.util.function.Function;

@Vetoed
public class RestValidateService {

    public static <P, F> F validate(Function<P, F> function, P requestInput) {
        validateInput(requestInput);
        return function.apply(requestInput);
    }

    public static <P> void validateVoid(Consumer<P> consumer, P p) {
        validateInput(p);
    }

    public static <P1, P2, F> F validate(Function2Arity<P1, P2, F> function, P1 requestInput, P2 idInput) {
        validateInput(requestInput);
        validateInput(idInput);
        return function.apply(requestInput, idInput);
    }

    private static <T> void validateInput(T input) {
        if (input == null) {
            throw new IllegalArgumentException("Invalid request.");
        }
    }
}
