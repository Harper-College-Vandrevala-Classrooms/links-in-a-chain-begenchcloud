package com.csc;


class ChainLink {
    public String color;

    ChainLink(String color) {
        this.color = color;
    }
}


class Node {
    ChainLink data;
    Node next;

    Node(ChainLink data) {
        this.data = data;
        this.next = null;
    }

    Node(ChainLink data, Node next) {
        this.data = data;
        this.next = next;
    }

    public ChainLink getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


public class Links {
    private Node head;

    public Links() {
        this.head = null;
    }


    public void append(ChainLink link) {
        Node newNode = new Node(link);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }


    public ChainLink get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative.");
        }
        
        Node current = head;
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
}
