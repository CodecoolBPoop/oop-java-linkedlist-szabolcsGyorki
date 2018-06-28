package com.codecool.dojolinkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList alist = new SinglyLinkedList();
        alist.add(5);
        alist.add(3);
        alist.add(54);
        alist.add(98);
        alist.add(23);


        for (int i = 0; i < 10; i++) {
            if (alist.hasNext()) {
                System.out.println(alist.next().getData());
            } else { break; }
        }

        System.out.println();
        System.out.println(alist.getItemAt(2).getData());
        System.out.println("Length of the list: " + alist.length());
        System.out.println("Head: " + alist.head().getData());
        System.out.println("Tail: " + alist.tail().getData());
    }

}
