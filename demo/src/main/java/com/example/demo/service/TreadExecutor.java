package com.example.demo.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TreadExecutor {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
//        Thread threads[]= new Thread[9];
//        for(int i=1; i<10; i++) {
//            final int p=0;
//             threads[i-1]= new Thread(
//                    ()->{
//                        factorial(p);
//                    }
//            );
//            threads[i-1].start();
//        }
//        for(Thread thr :threads){
//            try {
//                thr.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        //USING THREAD EXECUTOR
        ExecutorService  executorService = Executors.newFixedThreadPool(9);
        for (int i = 0; i < 9; i++) {
            final int finalP = 0;

            executorService.submit(() -> {
                factorial(finalP);
            });
        }
        executorService.shutdown();
//        executorService.submit(()->{
//            System.out.println("");
//        });
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total Time: " + (System.currentTimeMillis() - currentTime));
    }

    private static void factorial(int i) {
        int fact=1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int j=1; j<i; j++){
             fact*=j;
         }
        System.out.println(fact);
    }
}
