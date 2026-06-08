package com.example.demo.service.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class AllPairsOfGivenSum {
    public static void main(String[] args) {
       // Input:  [1, 5, 3, 2, 4], target = 5
        Map<Integer,Integer> seen = new HashMap<>();
        int arr[]={1,5,3,2,4};
        int target=5;
        for(int i=0; i<arr.length; i++){
            int first=target-arr[i];
            if(seen.containsKey(first)){
                System.out.println(seen.get(first)+ " "+i);
            }
            seen.put(arr[i],i);

            //
        }
        IntStream.rangeClosed(1,20).mapToObj(j->
                j%15==0 ? "Fizz Bizz" :
                        j%3==0 ? "Fizz" :
                                j%5==0? "Buzz" :String.valueOf(j)).
                forEach(System.out ::println);
    }
}
