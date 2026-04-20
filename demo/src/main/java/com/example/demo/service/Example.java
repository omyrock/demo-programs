package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
public class Example {
    public static void main(String[] args) {
        String name="OmvvirSingh";
        getCharacterCount(name);
    }

    private static void getCharacterCount(String name) {

        List<List<Integer>> listOfList=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));
        listOfList.stream().flatMap(List::stream).forEach(System.out::println);

    }

}
