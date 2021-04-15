package com.ptit.and.java.designpattern.interatorpattern;

public interface ItemIterator<T> {
    boolean hasNext();

    T next();
}
