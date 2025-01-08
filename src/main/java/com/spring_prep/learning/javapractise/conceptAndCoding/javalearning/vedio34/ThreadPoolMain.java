package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio34;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.*;

public class ThreadPoolMain {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,
                4,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(),
                new CustomRejectHandler()
        );

        threadPoolExecutor.allowCoreThreadTimeOut(true);

        for (int i = 0; i < 9; i++) {
           threadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task process by : " + Thread.currentThread().getName());
            });
        }

        threadPoolExecutor.shutdown();
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
        System.out.println("Task Rejected : " + r.toString());
    }
}
