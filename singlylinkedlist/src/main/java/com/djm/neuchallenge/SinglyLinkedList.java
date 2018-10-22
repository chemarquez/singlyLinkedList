package com.djm.neuchallenge;

public class SinglyLinkedList<T> implements ISinglyLinkedList<T> {
    private Object[] arreglo;
    private int resizeFactor;
    public int pivote = -1;

    public void push(T t) {
        checkCapacity();
        pivote += 1;
        this.arreglo[pivote] = t;

    }

    public T peek(){
        return pivote >=0 ? (T) this.arreglo[pivote]: null;
    }

    public T pop(){
        T element = null;
        if (pivote >=0) {
            element = (T) this.arreglo[pivote];
            this.arreglo[pivote] = null;
            pivote -= 1;
        }
        return element;
    }

    void checkCapacity() {
        if (this.arreglo.length - 1 > pivote + 1) {
            return;
        } else {
            resize();
        }
    }

    public SinglyLinkedList() {
        this(20);
    }

     /* Use this constructor to optimize performance in the  max amount of elements is known.
     * Don't use any factor lower than 20, in that case the parameter will be ignore and use 20 elements
     * as the number of elements to be created or added when needed.
     * @param resizeFactor
     */
    public SinglyLinkedList(int resizeFactor) {
        this.resizeFactor = resizeFactor < 20 ? 20: resizeFactor;
        this.arreglo = new Object[resizeFactor];
    }

    void resize() {
        Object[] aux = new Object[this.arreglo.length + resizeFactor];
        for (int i = 0; i < this.arreglo.length; i++) {
            aux[i] = this.arreglo[i];
        }
        this.arreglo = aux;
    }

    public boolean isEmpty() {
        return this.pivote == -1 ? true : false;
    }

    public void clear() {
        this.arreglo = new Object[resizeFactor];
    }


}
