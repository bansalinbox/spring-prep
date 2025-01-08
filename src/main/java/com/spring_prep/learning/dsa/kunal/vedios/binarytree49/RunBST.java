package com.spring_prep.learning.dsa.kunal.vedios.binarytree49;

public class RunBST {
    public static void main(String[] args) {
        int[] input = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        BST bst = new BST();
        bst.populate(input);
//        bst.display();
        bst.pre(bst.getRoot());
        System.out.println("========");
        bst.post(bst.getRoot());
    }
}
