package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning;

public class Trash implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getId()+ " This is child thead of main " + Thread.currentThread().getName());
    }
}
