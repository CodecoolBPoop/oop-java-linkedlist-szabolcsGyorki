package com.codecool.dojolinkedlist;

class Node {

    private int info;
    private Node next;


    Node(int info) {
        this.info = info;
        this.next = null;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    String getData() { return String.valueOf(info); }
}
