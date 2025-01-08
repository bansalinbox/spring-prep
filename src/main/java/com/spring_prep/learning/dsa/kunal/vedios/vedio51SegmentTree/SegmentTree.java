package com.spring_prep.learning.dsa.kunal.vedios.vedio51SegmentTree;

public class SegmentTree {

    private Node root;

    private static class Node{
        int data;
        int startinverval;
        int endinverval;
        Node left;
        Node right;
        public Node(int data, int startinverval, int endinverval){
            this.data = data;
            this.startinverval = startinverval;
            this.endinverval = endinverval;
        }
    }


}
