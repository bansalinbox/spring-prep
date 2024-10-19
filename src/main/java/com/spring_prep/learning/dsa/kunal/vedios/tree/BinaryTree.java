package com.spring_prep.learning.dsa.kunal.vedios.tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    // insert elements
    // Simple Binary Tree -- not binary search tree

    public void populate(Scanner scanner){
        System.out.println("Please enter root : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left value");
            int value = scanner.nextInt();
            Node leftNode = new Node(value);
            node.left = leftNode;
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right value");
            int value = scanner.nextInt();
            Node rightNode = new Node(value);
            node.right = rightNode;
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }
    private void display(Node node, String intend){

        if(node == null){
            return;
        }
        System.out.println(intend + node.value);
        display(node.left, intend + "\t");
        display(node.right, intend + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(scanner);
        binaryTree.display();
    }

}
