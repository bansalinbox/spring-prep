package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio30Thread_lifecycle.problem;

public class ProblemClient {

    public static void main(String[] args) {
        SharedQueue sharedResource = new SharedQueue(3);
        Thread producer = new Thread(() ->{
            try {
                for (int i = 0; i < 10; i++) {
                    sharedResource.produce(i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() ->{
            try {
                for (int i = 0; i < 100; i++) {
                    sharedResource.consumer();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producer.start();
        consumer.start();

    }
}
