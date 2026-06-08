package com.example.demo.service.streamOperation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> arrList=Arrays.asList(3,5,2,6,6,6,3,3,3);
        onlyDuplicate(arrList);
        listToMap(arrList);
    }

    private static void listToMap(List<Integer> arrList) {

    }

    private static void onlyDuplicate(List<Integer> arrList) {
//        List<Integer> collect = arrList.stream().filter(a -> Collections.frequency(arrList, a) > 1).collect(Collectors.toList());
        List<Integer> collect=arrList.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().filter(e->e.getKey()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);
    }
}
