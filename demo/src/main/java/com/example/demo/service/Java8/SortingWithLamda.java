package com.example.demo.service.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class SortingWithLamda {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,7,89,3);
        List<Integer> listOfNum = Arrays.asList(1,2,3,4,2,5,3,6);
        Set<Integer> collect = listOfNum.stream().filter(str ->Collections.frequency(listOfNum,str)<2).collect(Collectors.toSet());
        System.out.println(collect);
        // getSorting(list);
//        getSortingInTreeSet();
//        getSortingInTreeMap();
    }

    private static void getSortingInTreeMap() {
        Map<Integer,String> seen= new TreeMap<>();
        seen.put(1,"omv");
        seen.put(3,"vir");
        seen.put(0,"rohit");
        seen.put(-2,"Asman");
        LinkedHashMap sortdMap =seen.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));
        System.out.println(sortdMap);
    }

    private static void getSortingInTreeSet() {
        Set<Integer> set= new TreeSet<>((a,b)->(a>b)?-1 : (a<b)?1:0);
        // desending order
         set.add(68);
         set.add(7);
         set.add(43);
        System.out.print ("Sorting in Tree set is :");
        System.out.println(set);
    }

    private static void getSorting(List<Integer> list) {
        Collections.sort(list,(a,b)->(a>b)?1 :(a<b)?-1:0 );
        System.out.print("Soting is the list is :");
        System.out.println(list);
    }
}
