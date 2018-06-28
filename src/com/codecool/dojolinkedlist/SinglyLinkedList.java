package com.codecool.dojolinkedlist;

import com.codecool.dojolinkedlist.Node;

class SinglyLinkedList {

    private Node head = null;
    private Node tail = null;
    private static Node last = null;
    private static int length = 0;

    Node getItemAt(int i) {
        Node node;
        for (int j = 0; j < i+1; j++) {
            if (this.hasNext()) {
                node = this.next();
                if (j == i) {
                    return node;
                }
            } else { break; }
        }
        return null;
    }

    Node head() { return head; }

    Node tail() { return tail; }

    int length() { return length; }

    void add(int i) {
        Node node = new Node(i);
        if (head == null) {
            head = node;
        }
        if (tail == null) {
            tail = node;
        }
        tail.setNext(node);
        tail = node;
        length++;
    }

    void remove() {}

    boolean hasNext() {
        if (last == null) {
            return head.getNext() != null;
        }
        if (last.getNext() == null) {
            last = null;
            return false;
        }
        return last.getNext() != null;
    }

    Node next() {
        if (last == null) {
            last = head;
            return last;
        }
        Node nextNode = last.getNext();
        last = nextNode;
        return nextNode;
    }
}
