package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning;

public class ThreadRun {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId() + " main " + Thread.currentThread().getName());
        Trash trash = new Trash();
        Thread t1 = new Thread(trash);
        t1.start();
        System.out.println(Thread.currentThread().getId() + " Finined thread " + Thread.currentThread().getName());
    }
}
