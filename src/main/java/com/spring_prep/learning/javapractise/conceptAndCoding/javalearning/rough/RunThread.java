package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.rough;

public class RunThread {
    public static void main(String[] args) {
        System.out.println("thread name " + Thread.currentThread().getName());
        MyThreadCreation myThreadCreation = new MyThreadCreation();
        Thread thread = new Thread(myThreadCreation);
        thread.start();

        MyThreadExtend myThreadExtend = new MyThreadExtend();
        myThreadExtend.start();
    }
}
