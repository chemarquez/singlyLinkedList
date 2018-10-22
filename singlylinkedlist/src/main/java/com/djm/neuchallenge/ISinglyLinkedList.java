package com.djm.neuchallenge;

public interface ISinglyLinkedList<T extends Object> {

    void push(T t);

    T peek();

    T pop();

    boolean isEmpty();

}
