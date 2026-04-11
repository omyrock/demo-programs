package com.example.demo.service.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindElementWithMaximumFrequency {
    public static void main(String[] args) {
        int arr[]={5,6,7,3,7,8,5,5,4};
        getElementWithMaximumFrequency(arr);
    }

    private static void getElementWithMaximumFrequency(int[] arr) {
        Map<Integer,Integer> seen =new HashMap<>();
        for(int i=0; i<arr.length; i++){
            seen.put(arr[i],seen.getOrDefault(arr[i],0)+1);
        }
          int preValue=0;
           int result=0;
           for(Map.Entry<Integer,Integer> keyValue :seen.entrySet()){//(5,3)(6,1)(7,2)(3,4)
               if(keyValue.getValue()>preValue){
                   preValue=keyValue.getValue();//3//4
                   result=keyValue.getKey();//5//3
               }
           }
        System.out.println(result+ ", "+preValue);
    }
}
