package com.djm.neuchallenge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> singlyLinkedList =  new SinglyLinkedList<>();

    @Before
    public void init() {
        this.singlyLinkedList.clear();
    }

    @Test
    public void peekTest() {
        Integer entero = new Integer(9);
        this.singlyLinkedList.push(entero);
        Assert.assertEquals(entero, this.singlyLinkedList.peek());
    }

    @Test
    public void peekNullTest() {
        Assert.assertNull(this.singlyLinkedList.peek());
    }

}