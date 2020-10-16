package com.company;

import java.util.Collection;
import java.util.Iterator;

public class MyList<T> implements Collection<T> {

    class Node<T> {
        private T value;
        Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return this.next != null;
        }
    }
    Node<T> begin;
    long length;
    private Comparable comparable;

    public MyList (Comparable compare) {
        this.begin = null;
        this.length = 0;
        this.comparable = compare;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (begin == null) {
            this.begin = new Node(t);
        }
        else {
            this.end().setNext(new Node(t));
        }
        this.length++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public Node end() {
        if (this.begin == null)
            return null;

        Node iter = this.begin;
        while (iter.hasNext()) {
            iter = iter.getNext();
        }
        return iter;
    }

    public String tostring() {
        String result = "[";
        if (this.begin != null) {
            Node iter = this.begin;
            while (iter.hasNext()) {
                result += iter.getValue().toString() + ", ";
                iter = iter.getNext();
        }
        result += iter.getValue().toString() + " ";
        }
        result += "]";
        return result;
    }
    public void swap(int firstpos, int secondpos) {
        Node iter1;
        String a;
        Node iter2;
        iter1 = indexAt(firstpos);
        iter2 = indexAt(secondpos);
        a = iter1.getValue().toString();
        iter1.setValue(iter2.getValue());
        iter2.setValue(a);

    }

    public Node indexAt (int index) {
        Node iter = this.begin;
        int i = 0;
        if ((index < this.length) && (index >= 0)) {
            while (i < index) {
                iter = iter.getNext();
                i++;
            }
        }
        return iter;
    }
    public void sort() {
        Node iter;
        Node min;
        int k;
        for (int i = 0; i < this.length; ++i) {
            k = i;
            min = indexAt(i);
            for (int j = i; j < this.length; ++j) {
                iter = indexAt(j);
                if (this.comparable.compare(iter, min) <= 0) {
                    min = indexAt(j);
                    k = j;
                }
            }
            swap(i, k);
        }
    }


}