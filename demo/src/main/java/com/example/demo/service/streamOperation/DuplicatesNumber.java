package com.example.demo.service.streamOperation;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesNumber {
    public static void main(String[] args) {
        Integer[] arr ={6,7,7,8,4,6,3,33,2,6};
//        String srr="sanyaverma";
        getDuplicate(arr);
    }

    private static void getDuplicate(Integer[] arr) {
        Map<Boolean, List<Integer>> collect1 = Arrays.asList(arr).stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));
             List<Integer> listOfEven=collect1.get(true);
        List<Integer> listOfodd=collect1.get(false);
        System.out.println(listOfodd+ " "+listOfEven);
        Set<Integer> seen = new HashSet<>();
        // for String
        //Map<String, Long> collect = Arrays.asList(arr.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // FOR INTEGER ARRAY
        Set<Integer> collect = Arrays.asList(arr).stream().filter(a -> !seen.add(a)).collect(Collectors.toSet());
//        System.out.println(collect);

    }
}
