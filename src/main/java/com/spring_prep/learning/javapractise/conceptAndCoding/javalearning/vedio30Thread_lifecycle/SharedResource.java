package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio30Thread_lifecycle;

public class SharedResource {

    boolean isItemPresent = false;

    public synchronized void addItem(){
        isItemPresent = true;
        System.out.println("Producer thread is added, notify all");
        notifyAll();

    }

    public synchronized void consumeItem() {
        System.out.println("Consumer thread inside consumer item method");
        while (!isItemPresent){
            try {
                System.out.println("Consumer thread waiting" + isItemPresent);
                wait();
                System.out.println("Consumer thread after wait" + isItemPresent);
            } catch (Exception e){

            }
        }
        System.out.println("Consumer222 thread after wait" + isItemPresent);
        isItemPresent = false;
    }
}
