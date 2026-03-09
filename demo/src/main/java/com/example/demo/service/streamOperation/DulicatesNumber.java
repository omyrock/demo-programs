package com.example.demo.service.streamOperation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DulicatesNumber {
    public static void main(String[] args) {
        Integer[] arr ={6,7,7,8,4,6,3,33,2,6};
//        String srr="sanyaverma";
        getDuplicate(arr);
    }

    private static void getDuplicate(Integer[] arr) {

        Set<Integer> seen = new HashSet<>();
        // for String
        //Map<String, Long> collect = Arrays.asList(arr.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // FOR INTEGER ARRAY
        Set<Integer> collect = Arrays.asList(arr).stream().filter(a -> !seen.add(a)).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
