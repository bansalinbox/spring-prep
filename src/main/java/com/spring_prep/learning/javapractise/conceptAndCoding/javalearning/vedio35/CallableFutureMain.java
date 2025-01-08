package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedio35;

import java.util.concurrent.*;

public class CallableFutureMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4,
                6,
                10,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                );

        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() ->{
            System.out.println("asyncTask1 thread name -->" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "I am the return string form future";
        }, threadPoolExecutor);



        // 2nd type thenApply, it uses the same thread of asyncTask2
        // thenApplyAsync uses new thread ordering is not guranted, if you need ordering use thenCompose or thenComposeAsync

        // thenAccept | thenAcceptAync --> end of chain
        // thenCombine | thenCombineAsync

        CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() ->{
            System.out.println("asyncTask2 thread name -->" + Thread.currentThread().getName());
            return "I am the return string form future";
        }, threadPoolExecutor).thenApplyAsync((String val) ->{
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("asyncTask2 apply async thread name -->" + Thread.currentThread().getName());
            return val + " I am the rest of the string";
        }, threadPoolExecutor);

        System.out.println(asyncTask1.get());
        System.out.println(asyncTask2.get());

    }
}
