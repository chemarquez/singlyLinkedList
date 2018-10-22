package com.djm.neuchallenge;

public class Element<T> {

    public Element(T value, Element<T> prior) {
        this.value = value;
        this.prior = prior;
    }

    private T value;
    private Element<T> prior;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Element<T> getPrior() {
        return prior;
    }

    public void setPrior(Element<T> prior) {
        this.prior = prior;
    }



}
