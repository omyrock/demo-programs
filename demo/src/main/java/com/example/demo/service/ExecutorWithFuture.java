package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorWithFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
         executorExample();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Callable  gfd =() -> 45;
//        Future<Integer> submit = executorService.submit(() -> 45);
//        if(submit.isDone()){
//            System.out.println();
//        }
//        Integer i = submit.get();
//        System.out.println(i);
//        executorService.submit(() -> System.out.print("thread is running"),"success");
    }

    private static void executorExample() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Integer i = null;
//        try {
//            i = executorService.submit(() -> 1 + 4).get();// takes as callable as arguements it return future
//        } catch (InterruptedException e) {
//
//        } catch (ExecutionException e) {
//
//        }
//        System.out.println("sum is : " +i);
////        executorService.shutdown();
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//
//        }
        System.out.println(executorService.isTerminated());

        // INVOKE METHOD
        Callable<Integer> c1=()->{
            Thread.sleep(1000);
            System.out.println("One Task");
            return 1;
        };
        Callable<Integer> c2=()->{
            Thread.sleep(1000);
            System.out.println("Second Task");
            return 2;
        };
        Callable<Integer> c3=()->{
            Thread.sleep(1000);
            System.out.println("Third Task");
            return 3;
        };
        List<Callable<Integer>> list = Arrays.asList(c1, c2, c3);
        List<Future<Integer>> futures = null;
        try {
//            futures = executorService.invokeAll(list,1, TimeUnit.SECONDS );
            Integer i1 = executorService.invokeAny(list);
            System.out.println(i1);
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
//
//        for(Future<Integer> a: futures){
//            try {
//                System.out.println(a.get());
//            } catch ( CancellationException e) {
//
//            }
//
//            catch (  InterruptedException e) {
//
//            } catch (ExecutionException e) {
//
//            }
//        }
        Thread.sleep(1000);
        executorService.shutdown();

        System.out.println("Hello World");


    }
}
