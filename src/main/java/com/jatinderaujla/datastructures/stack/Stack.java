package com.jatinderaujla.datastructures.stack;

public interface Stack<T> {
    Integer DEFAULT_SIZE = 10;

    void push(T element);

    T pop();

    T peek();

    boolean isEmpty();
}
