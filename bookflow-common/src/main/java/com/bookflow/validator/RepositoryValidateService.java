package com.bookflow.validator;

import java.util.function.Consumer;
import java.util.function.Function;

public class RepositoryValidateService {

    public static <P, F> F validate(Function<P, F> function, P p) {
        validateInput(p);

        F apply;

        try {
            apply = function.apply(p);
        } catch (Exception e) {
            throw new RuntimeException("Repository failed.");
        }

        if (apply == null) {
            throw new RuntimeException("Entity not found.");
        }
        return apply;
    }

    public static <P> void validateVoid(Consumer<P> consumer, P p) {
        validateInput(p);

        try {
            consumer.accept(p);
        } catch (Exception e) {
            throw new RuntimeException("Repository failed.");
        }
    }

    public static <P1, P2, F> F validate(Function2Arity<P1, P2, F> function, P1 p1, P2 p2) {
        validateInput(p1);
        validateInput(p2);

        F apply;
        try {
            apply = function.apply(p1, p2);
        } catch (Exception e) {
            throw new RuntimeException("Repository failed.");
        }

        if (apply == null) {
            throw new RuntimeException("Entity not found.");
        }
        return apply;
    }

    private static <T> void validateInput(T input) {
        if (input == null) {
            throw new IllegalArgumentException("Invalid request.");
        }
    }
}
