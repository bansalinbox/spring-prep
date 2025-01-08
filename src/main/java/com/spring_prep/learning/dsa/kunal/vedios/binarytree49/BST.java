package com.spring_prep.learning.dsa.kunal.vedios.binarytree49;

public class BST {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    private Node root;

    public Node getRoot(){
        return root;
    }
    public BST(){
    }

    public int height(Node node){
        if(node ==  null) return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value > node.getValue()){
            node.right = insert(value, node.right);
        }else{
            node.left = insert(value, node.left);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        return Math.abs(height(node.left)- height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


    public void display(){
        display(root, "Root node :");
    }

    private void display(Node node, String details){
        if(node == null) return;
        System.out.println(details + node.getValue());

        display(node.left, "Left child of : " + node.getValue() + " : ");
        display(node.right, "Right child of : " + node.getValue() + " : ");
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void pre(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        pre(node.left);
        pre(node.right);
    }

    public void post(Node node){
        if(node == null){
            return;
        }
        post(node.left);
        post(node.right);
        System.out.print(node.value + " ");
    }
}
