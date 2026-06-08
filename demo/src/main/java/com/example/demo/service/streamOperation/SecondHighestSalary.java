package com.example.demo.service.streamOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

record SecondHighestSalary(Integer salary,String name) {
     public static void main(String[] args) {
         SecondHighestSalary first= new SecondHighestSalary(1000,"omvir");
         SecondHighestSalary sec= new SecondHighestSalary(110,"singh");
         SecondHighestSalary third= new SecondHighestSalary(2000,"singh");


         List<SecondHighestSalary> salaryList= new ArrayList<>();
         salaryList.add(first);
         salaryList.add(sec);
         salaryList.add(third);
         salaryList.stream().map(SecondHighestSalary::salary).distinct().
                 sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
         //  TOP TWO HIGHEST SALARY
         List<Integer> topTwo=salaryList.stream().map(SecondHighestSalary::salary).sorted(Comparator.reverseOrder()).distinct().
                 limit(2).collect(Collectors.toList());
         System.out.println(topTwo);
     }
}
