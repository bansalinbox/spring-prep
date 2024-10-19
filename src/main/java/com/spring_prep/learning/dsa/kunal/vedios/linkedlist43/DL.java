package com.spring_prep.learning.dsa.kunal.vedios.linkedlist43;

import java.security.PublicKey;

public class DL {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println(" End ");
    }

    public void displayRev(){
        Node temp = tail;

        while (temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.previous;
        }
        System.out.println(" End ");
    }

    public DL(){

    }

    public class Node{
        private int value;
        private Node previous;
        private Node next;

        public Node(int value){
            this.value = value;
            previous = null;
            next = null;
        }

        public Node(int value, Node next, Node previous){
            this.value = value;
            previous = previous;
            next = next;
        }

    }
}
