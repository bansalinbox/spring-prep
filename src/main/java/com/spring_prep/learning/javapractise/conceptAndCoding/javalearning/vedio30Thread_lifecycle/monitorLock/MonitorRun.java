package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio30Thread_lifecycle.monitorLock;

public class MonitorRun {

    /*
    See that task 1 and task 2 are different method, but they put the monitor lock on the object.
     */
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(() -> obj.task1());
        Thread t2 = new Thread(() -> obj.task2());
        Thread t3 = new Thread(() -> obj.task3());

        t1.start();
        t2.start();
        t3.start();

//        MonitorLockExample obj = new MonitorLockExample();
//        MonitorLockExample obj2 = new MonitorLockExample();
//        Thread t1 = new Thread(() -> obj.task1());
//        Thread t2 = new Thread(() -> obj2.task2());
//        Thread t3 = new Thread(() -> obj.task3());
//
//        t1.start();
//        t2.start();
//        t3.start();
    }
}
