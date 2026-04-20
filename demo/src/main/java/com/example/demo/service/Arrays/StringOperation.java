package com.example.demo.service.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperation {
    public static void main(String[] args) {
        String input = "adbbrrddeff";
        getFirstNon(input);
    }

    private static void getFirstNon(String input) {
        String strArray[]=input.split("");
       List<String> nonRepeating= Arrays.stream(strArray).filter(str->input.indexOf(str)==input.lastIndexOf(str)).collect(Collectors.toList());
        System.out.println(nonRepeating.get(0));


    }
}
