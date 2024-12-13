package com.csc;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}

public class Links<T> {
    private Node<T> head;

    public Links() {
        this.head = null;
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void prepend(T data) {
        Node<T> newNode = new Node<>(data, head);
        head = newNode;
    }

    public T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative.");
        }

        Node<T> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current.getData();
            }
            current = current.getNext();
            currentIndex++;
        }

        throw new IndexOutOfBoundsException("Index out of bounds.");
    }

    public int size(Node<T> node) {
        int count = 0;
        Node<T> current = node;

        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }

    public Node<T> getHead() {
        return head;
    }
}
