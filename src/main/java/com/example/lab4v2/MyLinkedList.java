package com.example.lab4v2;
public class MyLinkedList<T> implements LinkedListInterface{
    private int size;
    public MyLinkedList(){
        this.size=0;
    }
    private class Node {
        T data;
        Node next;
        Node(){
            next =null;
        }
        Node (T data) {
            this.data = data;
            next = null;
        }
    }
    private Node head = null;
    @Override
    public void pushLast(Object j) {
        Node tail = new Node();
        Node temp = new Node();
        tail.data = (T) j;
        tail.next = null;
        if (head == null) {
            head = tail;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = tail;
        }
        size++;
    }

    @Override
    public void offerFirst(Object j) {
        Node head2 = new Node();
        head2.data = (T) j;
        if (head == null) {
            head2.next = null;
        } else {
            head2.next = head;
        }
        head = head2;
        size++;
    }

    @Override
    public T peekLast() {
        Node tail = new Node();
        Node temp = new Node();
        temp = head;
        while (temp.next != null) {
            tail = temp;
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public T peekFirst() {
        Node temp = new Node();
        temp = head;
        return (T) temp.data;
    }

    @Override
    public void popLast() {
        Node tail = new Node();
        Node temp = new Node();
        temp = head;
        while (temp.next != null) {
            tail = temp;
            temp = temp.next;
        }
        tail.next = null;
        size--;
    }

    @Override
    public void popFirst() {
        Node temp = new Node();
        temp = head;
        head = head.next;
        size--;
    }

    @Override
    public void popBetween(int pos) {
        Node body = new Node();
        Node temp = new Node();
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }
        Object data = new Object();
        data = current.next.data; //return data
        current.next = current.next.next;
        size--;
    }

    @Override
    public void putBetween(Object j, int pos) {
        Node newNode = new Node((T) j);
        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    @Override
    public T peekBetween(int pos) {
        Node current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return (T) current.data;
    }

    @Override
    public void traverse() {
        Node temp = new Node();
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
