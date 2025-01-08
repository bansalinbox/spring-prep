package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio30Thread_lifecycle.problem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {

    Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedQueue(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        System.out.println("producer method is invoked" + item);
        while(sharedBuffer.size() == bufferSize){
            System.out.println("producer going to wait");
            wait();
        }
        sharedBuffer.add(item);
        notify();
    }

    public synchronized int consumer() throws InterruptedException {
        while(sharedBuffer.isEmpty()){
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed item " + item);
        notify();
        return item;

    }
}
