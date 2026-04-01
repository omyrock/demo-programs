package com.example.demo.service.streamOperation;

import java.util.*;
import java.util.stream.Collectors;

public class SortingOfHashMapBasedOntheKeyValue {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
         map.put(3,"omv");
        map.put(2,"vf");
        map.put(5,"ir");
        System.out.println(getSortingMap(map));
         
    }

    private static Map<Integer,String> getSortingMap(Map<Integer, String> map) {
          List<Map.Entry<Integer,String>> mapList= new ArrayList<>(map.entrySet());
         return   map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                  collect(Collectors.toMap(Map.Entry::getKey,
                          Map.Entry ::getValue,(a,b)->a,LinkedHashMap::new));

    }
}