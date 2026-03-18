package com.example.demo.service.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplacingDuplicateWithSpecialCharacter {
    public static void main(String[] args) {
        int arr[]={2,4,3,5,5,2};
        replacingDuplicate(arr);
    }

    private static void replacingDuplicate(int [] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        String [] string= new String[arr.length];
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i])>1){
                string[i]="#";
            }else string[i]=String.valueOf(arr[i]);
        }
        Arrays.asList(string).forEach(System.out::println);
    }

}
