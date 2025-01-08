package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio30Thread_lifecycle;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedObj = new SharedResource();
        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedObj.addItem();
        }
        );

        Thread consumeThread = new Thread(() -> {
            sharedObj.consumeItem();
        });

        producerThread.start();
        consumeThread.start();
    }
}
