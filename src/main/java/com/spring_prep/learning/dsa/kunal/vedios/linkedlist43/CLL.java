package com.spring_prep.learning.dsa.kunal.vedios.linkedlist43;

public class CLL {

    private Node head;
    private Node tail;

    public void insert(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display(){
        Node temp = head;
        while (temp != null && temp != tail){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.print(temp.value + " --> ");
        System.out.print(" HEAD ");
    }

    public void displayOr(){
        Node temp = head;
        if(temp != null){
            do {
                System.out.print(temp.value + " --> ");
                temp = temp.next;
            }while (temp != head);
            System.out.print("HEAD");
        }
    }

    public void delete(int value){
        if(value == head.value){
            head.next = head;
            tail.next = head;
            return;
        }
        Node temp = head;
        Node secondLast = null;
        while (temp != tail){
            if(temp.value == value){
                break;
            }
            secondLast = temp;
            temp = temp.next;
        }
        secondLast.next = temp.next;
    }



    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node node){
            this.value = value;
            this.next = node;
        }
    }
}
