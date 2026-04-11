package com.example.demo.service.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int arr1[]={4,3,2,4,7};
        int arr[]={4,3,2,4,7,7};

//        getFirstAndLastIndexOfRepeatedNumber(arr1);
          getAllRepaetingElementWithIndexes(arr);
    }

    private static void getAllRepaetingElementWithIndexes(int[] arr) {
        Map<Integer, List<Integer>> mapList= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            mapList.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
        }
        for(Map.Entry<Integer,List<Integer>> keyIndexes:mapList.entrySet()){
            if(keyIndexes.getValue().size()>1){
                System.out.println(keyIndexes.getKey()+ " "+keyIndexes.getValue());
            }
        }
    }

    private static void getFirstAndLastIndexOfRepeatedNumber(int[] arr) {
        Map<Integer,Integer> seen= new HashMap<>();

 int target=-1;
         for(int i=0; i<arr.length; i++){
              seen.put(arr[i], seen.getOrDefault(arr[i],0)+1);
         }
         for(Map.Entry<Integer, Integer> keyValue:seen.entrySet()){
             if(keyValue.getValue()>1){
                 target=keyValue.getKey();
             }
        }System.out.println(target);
         int first=-1;
         int last=-1;
         for(int i=0; i<arr.length; i++){
             if(target==arr[i]){
                 if(first==-1){
                     first=i;
                 }
                 last=i;
             }
         }
        System.out.println(first+ "  "+last);
    }
}
