package com.djm.neuchallenge;

/**
 * This is another improved version without using arrays.
 * The advantage of it is that it can growth as needed without performance issues due
 * the typical resizing process needed when the array is full.
 * @param <T> it is parameterized so it can be used with multiple types.
 */
public class TopSinglyLinkedList<T> implements ISinglyLinkedList<T> {
    private Element<T> top = null;
    private int size = 0;

    @Override
    public void push(T t) {
        Element<T> newElement = new Element<>(t, this.top);
        this.top = newElement;
        size += 1;
    }

    @Override
    public T peek() {
        return this.top == null ? null : this.top.getValue();
    }

    @Override
    public T pop() {
        // 1) If stack is empty then return null
        if (this.top == null) {
            return null;
        } else { //2) If stack is not empty, remove top element and assign current top.prior to top
            T t = top.getValue();
            this.top = this.top.getPrior();
            size -= 1;
            return t;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return this.size == 0 ? true : false;
    }

    public void clear() {
        this.top = null;
        this.size = 0;
    }
}
