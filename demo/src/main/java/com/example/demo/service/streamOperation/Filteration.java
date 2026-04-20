package com.example.demo.service.streamOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filteration {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Array", "map", "set", "queueImpl");
        getRequiredResult(list);
    }

    private static void getRequiredResult(List<String> list) {
        List<String> collect = list.stream().filter(sr -> sr.length() > 4).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

       Stream<Integer> stream= Stream.of(1,2,4);
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
