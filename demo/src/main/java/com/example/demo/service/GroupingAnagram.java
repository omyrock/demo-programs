package com.example.demo.service;

import java.util.*;

public class GroupingAnagram {
    public static void main(String[] args) {
        List<String> group= Arrays.asList("eat","tea","pan","nap","rat");
        System.out.println(getGroupingAnagram(group));
    }

    private static List<List<String>> getGroupingAnagram(List<String> group) {
        Map<String,List<String>> seen= new HashMap<>();

            for(int i=0; i<group.size(); i++){
                 char first[]=group.get(i).toCharArray();
                 Arrays.sort(first);
                 String string= new String(first);
                 if(!seen.containsKey(string)){
                     seen.put(string,new ArrayList<>());
                 }
                 seen.get(string).add(group.get(i));
            }
        return new ArrayList<>(seen.values());
    }

}
