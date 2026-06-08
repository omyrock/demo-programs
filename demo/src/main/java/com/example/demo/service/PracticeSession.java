package com.example.demo.service;

import java.util.*;
import java.util.stream.Collectors;

  public class PracticeSession {
    public static void main(String[] args) {
        // list of employee
        // more record
        int Array1[] = {6, 11, 16, 25, 45, 85};
       int Array2[] = {11, 12, 25, 85, 105};
       int Array3[] = {8, 9, 20, 25, 35, 75, 85, 125};

       Set<Integer> set1= Arrays.stream(Array1).boxed().collect(Collectors.toSet());
        Set<Integer> set2= Arrays.stream(Array2).boxed().collect(Collectors.toSet());
        Arrays.stream(Array3).filter(set1::contains)
                .filter(set2::contains).forEach(System.out::println);
        //// adding the employee checking duplicate


        Employee employee= new Employee("om","address");
        Employee employe2= new Employee("om","address");
        Employee employe3= new Employee("om","etah");
        Set<Employee> employeeSet= new HashSet<>();
        employeeSet.add(employee);
        employeeSet.add(employe2);
        employeeSet.add(employe3);
        System.out.println(employeeSet);



//          employees.add(new Employee("om","etah"));


    }
}
  record Employee(String name,String address){


}

