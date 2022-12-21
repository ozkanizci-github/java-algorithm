package com.ozkan;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {

        Collection<Integer> list  = new LinkedList<Integer>();
        list.add(99);
        list.add(98);
        list.add(97);
        list.add(96);

        System.out.println("The element present list: " +list);
        System.out.println("The element present list: " +list.size());
        System.out.println("The element present list: " +list.isEmpty());
        list.clear();
        System.out.println("The element present list: " +list);
        System.out.println("The element present list: " +list.isEmpty());
    }
}
