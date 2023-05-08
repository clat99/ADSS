package HSolution;

import java.io.*;
import java.util.*;

public class Q10Solution {
    static class Node {
        private int data;
        private Node next;

        public Node() {
            data = 0;
            next = null;
        }

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node head;

    public Q10Solution(){
        head=null;
    }

    public void delAll() {
        head = null;
        System.out.println("Linked list deleted");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
       
        Q10Solution list = new Q10Solution();
        list.addFirst(3);
        list.addFirst(9);
        list.addFirst(15);
        list.addFirst(4);
        list.addFirst(7);
        list.addFirst(19);
        list.addFirst(2);
        list.addFirst(6);
        list.addFirst(20);
        list.addFirst(8);
        list.delAll();
    }
}