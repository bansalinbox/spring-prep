package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.rough;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyThreadPoolExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("this is started");
        ThreadPoolExecutor th = new ThreadPoolExecutor(2
                , 4
                , 10
                , TimeUnit.MINUTES
                , new ArrayBlockingQueue<>(2)
                , new CustomThreadFactory()
                , new CustomRejectHandler()
                );

        th.allowCoreThreadTimeOut(true);
//        for (int i = 0; i < 5; i++) {
//            th.submit(() ->{
//                System.out.println("task code will be here before" + Thread.currentThread().getName());
//                try{
//                    Thread.sleep(5000);
//                }catch (Exception e ){
//
//                }
//                System.out.println("task code will be here " + Thread.currentThread().getName());
//            });
//        }

        Future<?> xx = th.submit(() -> {
            System.out.println("task code will be here before" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("task code will be here " + Thread.currentThread().getName());
            return "I am done";
        });

        System.out.println(xx.get());
        List<String> output =  null;
        Future<List<String>> xx2 = th.submit(() -> {
            System.out.println("task code will be here before" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("task code will be here " + Thread.currentThread().getName());
            output.add("I am done2");
        }, output);

        Future<Integer> xx3 = th.submit(() -> {
            System.out.println("task code will be here before" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("task code will be here " + Thread.currentThread().getName());
            return 45;
        });


//        Thread.sleep(2000);
//        xx.cancel(true);
//        String dd = (String)xx.get();
//        System.out.println("dd --->" + dd);
        th.shutdown();
    }

}

class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}

class CustomRejectHandler implements RejectedExecutionHandler{


    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task has been rejected");
    }
}