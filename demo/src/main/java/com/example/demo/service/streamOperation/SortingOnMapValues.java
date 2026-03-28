package com.example.demo.service.streamOperation;


import java.util.*;
import java.util.stream.Collectors;

public class SortingOnMapValues {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"fd");
        map.put(3,"ww");
        map.put(5,"qq");
        List<Map.Entry<Integer,String>> listOfMap= new ArrayList<>(map.entrySet());
        Collections.sort(listOfMap,(a,b)->a.getValue().compareTo(b.getValue()));
        LinkedHashMap<Integer, String> collect = listOfMap.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->  e1,LinkedHashMap :: new));
        System.out.println(collect);
    }
}
//interface A{
//    default int  show(){
//        System.out.println("A");
//        return 0;
//    }
//}
//interface B{
//    default int show(){
//        System.out.println("B");
//        return 0;
//    }
//}
// class C implements A,B{
//
////     public static void main(String[] args) {
////         C c= new C();
////         c.show();
////     }
//     @Override
//     public int show() {
//         System.out.println("C");
//         return 0;
//     }
// }
//
//
//
//
// abstract class D{
//    private int a=3;
//     public abstract void show();
//        }
//  class G extends D{
//
//      @Override
//      public void show() {
//      }
//  }
 // key=Integer
// value=String
