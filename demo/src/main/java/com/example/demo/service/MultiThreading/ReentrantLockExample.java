package com.example.demo.service.MultiThreading;


import com.example.demo.service.executor.ThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) {
        ReentrantLock reentrantLock= new ReentrantLock();
        ExecutorService executorService =Executors.newFixedThreadPool(3);
         executorService.submit(()-> System.out.println(Thread.currentThread().getName()));
               executorService.shutdown();
    }
}
