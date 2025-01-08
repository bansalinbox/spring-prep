package com.spring_prep.learning.dsa.general.doublelinkedlist;

import java.util.LinkedHashMap;

public class DoubleLinkedList {

    Node head;
    Node tail;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }

    //1. insert first
    public void addFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.pre = node;
            head = node;
        }
    }

    // insert at a position
    public void insertAt(int value, int pos){
        if(pos == 1){
            addFirst(value);
        }else{
            int count = 1;
            Node current = head;
            Node newNode = new Node(value);
            while(current != null && count < pos){
                current = current.next;
                count++;
            }
            if(current == null){
                // insert at the end
                insertAtEnd(value);
            }
            newNode.next = current;
            newNode.pre = current.pre;
            current.pre.next = newNode;
            current.pre = newNode;
        }
    }

    // insert at the end
    public void insertAtEnd(int value){
        if(head == null){
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode.pre = tail;
        tail = newNode;
    }

    // Delete At first
    public void deleteFirst(){
        if(head == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
        }
        Node temp = head;
        head = head.next;
        head.pre = null;
        temp.next = null;
    }
    // Delete at index
    //       4
    // 1 2 3   5

    public void deleteAt(int index){

        new LinkedHashMap<>(5, 0.75f, true);
        if(head == null){
            return;
        }
        if(index == 1){
            deleteFirst();
            return;
        }
        Node current = head;
        int counter = 1;
        while(current != null && counter < index){
            current = current.next;
            counter++;
        }

        if(current == null){
            return;
        }

    }

    // Delete at end

}

class Node {
    int data;
    Node pre;
    Node next;

    public Node(int value){
        this.data = value;
        this.next = null;
        this.pre = null;
    }
}