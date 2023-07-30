package com.bookflow.validator;

@FunctionalInterface
public interface Function2Arity<P1, P2, R> {

    R apply(P1 p1, P2 p2);
}
