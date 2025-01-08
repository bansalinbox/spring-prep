package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.rough;

public class MyThreadExtend extends Thread{

    @Override
    public void run(){
        System.out.println("New thread name MyThreadExtend : " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("this is my thread, working on something MyThreadExtend");
    }
}
