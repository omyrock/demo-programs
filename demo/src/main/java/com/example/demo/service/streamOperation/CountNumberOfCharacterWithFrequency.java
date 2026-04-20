package com.example.demo.service.streamOperation;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountNumberOfCharacterWithFrequency {
    public static void main(String[] args) {
        String [] arrStr = {"are we the", "hello we are", "the java", "of", "powerful we are", "streams", "world we are"};
           String string= String.join("",arrStr);
            string= string.replace(" ","");
           String strArray[]=string.split("");
           Map<String,Long> dddd =Arrays.asList(strArray).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(dddd);
//        getCharacterWithNumberOfFrequencyCount(string);


    }

    private static void getCharacterWithNumberOfFrequencyCount(String string) {
          String strArray= string.replace(" ","");
         Map<Character,Long> seen=strArray.chars().mapToObj(c->(char)c).
                 collect(Collectors.groupingBy(c->c, Collectors.counting()));
        System.out.println(seen);



    }
}
