package com.spring_prep.learning.dsa.kunal.vedios.linkedlist43;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);

            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node newNode = new Node(value);

        int count = 0;
        Node temp = head;
        while (count != index -1){
            temp = temp.next;
            count++;
        }
        Node temp1 = temp.next;
        temp.next = newNode;
        newNode.next = temp1;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (value == node.value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public int deleteLastGourav(){
        if(size == 1){
            return deleteFirst();
        }
        Node previous = null;
        Node temp = head;
        int value = 0;
        while (temp.next != null){
            previous = temp;
            temp = temp.next;
        }
        value = previous.next.value;
        previous.next = null;
        tail = previous;
        return value;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size -2);
        int value = secondLast.next.value;
        secondLast.next = null;
        tail = secondLast;
        return value;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }

        Node pre = get(index -1);
        int value = pre.next.value;
        pre.next = pre.next.next;
        return value;
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        this.head = node;
        if(this.tail == null){
            this.tail = node;
        }
        this.size++;
    }


    public void insertLast(int value){
        Node node = new Node(value);
        if(this.tail == null){
            insertFirst(value);
            return;
        }
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }

    public void display(){
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertUsingRecursion(int value, int index, Node current){
        Node previous = current;
        if(index == 0){
            Node newNode = new Node(value);
            previous.next = newNode;
            newNode.next = current;
            return;
        }
        current = current.next;
        insertUsingRecursion(value, index - 1, current);
    }

    public LL() {
        this.size = 0;
    }

    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
