package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio30Thread_lifecycle.monitorLock;

public class MonitorLockExample {

    public synchronized void task1(){
        System.out.println("task 1 has been called");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("task 1 object monitor lock has been released");
    }


    public void task2(){
        System.out.println("task 2 has been called");
        synchronized (this){
            System.out.println("task 2 inside synchronized block");
        }
        System.out.println("task 2 end");
    }

    public void task3(){
        System.out.println("task 3 has been called");
    }
}
