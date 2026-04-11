package com.example.demo.service.streamOperation;

import java.util.Arrays;
import java.util.List;

public class OperationWithSameNumberOfString {
    public static void main(String[] args) {
        //streamOperation();
        getpalindromeFromtheArray();
    }

    private static void getpalindromeFromtheArray() {

        String[] myArrays
                = new String[] { "madam", "please", "refer",
                "link",  "on",     "racecar" };
         Arrays.asList(myArrays).stream().filter(s->palindrome(s)).forEach(System.out
         ::println);


    }

    private static boolean palindrome(String s) {

         for(int i=0; i<s.length()/2; i++){
             if (s.charAt(i)==s.charAt(s.length()-1-i)){
                 return true;
             }else return false;
         }
         return true;

    }

    private static void streamOperation() {
        int length=5;

        List<String> list = Arrays.asList("omvir", "singh", "rohit", "usman", "khan", "saba", "brijesh");
          list.stream().filter(str->(str.length()==length)).
                  map(String::toUpperCase).forEach(System.out::println);

    }
}
