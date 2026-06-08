package com.example.demo.service.Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeating {
    public static void main(String[] args) {
        String str="ddabcab";
        System.out.println(getFirstNonRepeating(str));
    }

    private static char getFirstNonRepeating(String str) {
       return str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1)
                .findFirst().get().getKey();
    }
}
