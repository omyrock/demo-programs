package com.example.demo.service.streamOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(3,9,1,33,6);
        List<List<Integer>> list1 = Arrays.asList(Arrays.asList(2, 3, 3, 3), Arrays.asList(9, 8, 7, 6));
        parallelSeparation(list1);
//        oddEvenSeparation(list);
    }

    private static void parallelSeparation(List<List<Integer>> list1) {
        list1.stream().flatMap(List::stream).forEach(System.out::println);
    }

    private static void oddEvenSeparation(List<Integer> list) {
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        List<Integer> integers = collect.get(true);
        System.out.println(integers);
    }
}
