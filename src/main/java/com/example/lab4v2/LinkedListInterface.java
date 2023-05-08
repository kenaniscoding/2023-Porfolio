package com.example.lab4v2;

public interface LinkedListInterface<T> {
    public void pushLast(T j);
    public void offerFirst(T j);
    public T peekLast();
    public T peekFirst();
    public void putBetween(T j, int pos);
    public T peekBetween(int pos);
    public void popLast();
    public void popFirst();
    public void popBetween(int pos);
    public void traverse();
    public int size();
    public boolean isEmpty();
}
