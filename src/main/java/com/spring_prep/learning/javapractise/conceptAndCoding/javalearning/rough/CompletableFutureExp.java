package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.rough;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        CompletableFuture<String> xx = CompletableFuture.supplyAsync(()->{
            System.out.println("xx --->" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
                System.out.println("xx is done ---> " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "I am the future";
        });

        CompletableFuture<Integer> pp = xx.thenApplyAsync((String s) -> {
            System.out.println("pp --->" + Thread.currentThread().getName());
            System.out.println("I am synchronous");
            return 45;
        });

        CompletableFuture<String> result = xx.thenCombine(pp, (String s, Integer y) -> s + y);
        String output = result.get();
        System.out.println("output --->" + output);



        System.out.println(Thread.currentThread().getName() + " I am in the end");

    }
}
