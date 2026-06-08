package com.example.demo.service.Arrays;

import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={0,1,2,4};
        int missingNumber=getMissingNumber(arr);
        System.out.println(missingNumber);
    }

    private static int getMissingNumber(int[] arr) {
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Input Array can't be null " +
                    "or empty");
        }
        int n=arr.length;
//        int expected=IntStream.rangeClosed(0,n).sum();
//        int actual=IntStream.of(arr).sum();
        // IN  PRODUCTION NEED TO WRITE THE CORE LOGIC NOT THE STREAM
        // CAUSE OF STREAM OVERHEAD
//        return expected-actual;
   return 0;
    }
}
