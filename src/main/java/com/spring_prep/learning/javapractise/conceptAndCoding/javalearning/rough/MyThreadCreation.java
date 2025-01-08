package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.rough;

public class MyThreadCreation implements Runnable{
    @Override
    public void run() {
        System.out.println("New thread name MyThreadCreation : " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("this is my thread, working on something MyThreadCreation");
    }
}
