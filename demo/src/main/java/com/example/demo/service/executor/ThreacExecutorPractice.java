package com.example.demo.service.executor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreacExecutorPractice {
    public static void main(String[] args) {
        ExecutorService  executorService=Executors.newFixedThreadPool(1);
                executorService.submit(()->getSumOfNumbers());
                executorService.shutdown();
    }

    private static void getSumOfNumbers() {
        List<Integer> list=Arrays.asList(2,4,7,3,2);
        int sum=list.stream().reduce((a,b)->a+b).get();
        System.out.println(sum);
    }


}
