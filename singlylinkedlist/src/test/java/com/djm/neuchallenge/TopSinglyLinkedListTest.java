package com.djm.neuchallenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TopSinglyLinkedListTest {
    private TopSinglyLinkedList<Integer> integerTopSinglyLinkedList = new TopSinglyLinkedList<>();

    @Before
    public void init() {
        this.integerTopSinglyLinkedList.clear();
    }

    @Test
    public void peekTest() {
        Integer entero = new Integer(9);
        this.integerTopSinglyLinkedList.push(entero);
        Assert.assertEquals(entero, this.integerTopSinglyLinkedList.peek());
    }
    @Test
    public void popTest() {
        Integer entero = new Integer(9);
        this.integerTopSinglyLinkedList.push(entero);
        Assert.assertEquals(1, this.integerTopSinglyLinkedList.getSize());
        Assert.assertEquals(entero, this.integerTopSinglyLinkedList.pop());
        Assert.assertEquals(0, this.integerTopSinglyLinkedList.getSize());
    }

    @Test
    public void peekNullTest() {
        Assert.assertNull(this.integerTopSinglyLinkedList.peek());
    }
}
