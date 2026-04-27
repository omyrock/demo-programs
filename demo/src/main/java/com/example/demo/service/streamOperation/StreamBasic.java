package com.example.demo.service.streamOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamBasic {
    public static void main(String[] args) {
        int arr[]={4,6,5,3,2,5,2};
        Map<Integer, List<Integer>> seen = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            seen.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
        }
       for(Map.Entry<Integer,List<Integer>> keyValue:seen.entrySet()){
         if(keyValue.getValue().get(0)>1){
             System.out.println();
         }
        }
        System.out.println(seen);

    }
}
