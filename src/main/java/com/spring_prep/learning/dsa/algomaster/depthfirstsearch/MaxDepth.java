package com.spring_prep.learning.dsa.algomaster.depthfirstsearch;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class MaxDepth {

    int depth = 0;

//    public static int dfs(Node<Integer> root){
//        if(root == null){
//            return 0;
//        }
//        int left = dfs(root.left);
//        int right = dfs(root.right);
//
//
//    }


    public static int treeMaxDepth(Node<Integer> root) {

        if(root == null){
            return 0;
        }
        treeMaxDepth(root.left);


        return 0;
    }
    public static class Node<T> {
        public T val;
        public Node<T> left;
        public Node<T> right;

        public Node(T val) {
            this(val, null, null);
        }

        public Node(T val, Node<T> left, Node<T> right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static <T> Node<T> buildTree(Iterator<String> iter, Function<String, T> f) {
        String val = iter.next();
        if (val.equals("x")) return null;
        Node<T> left = buildTree(iter, f);
        Node<T> right = buildTree(iter, f);
        return new Node<T>(f.apply(val), left, right);
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node<Integer> root = buildTree(splitWords(scanner.nextLine()).iterator(), Integer::parseInt);
        scanner.close();
        int res = treeMaxDepth(root);
        System.out.println(res);
    }
}
