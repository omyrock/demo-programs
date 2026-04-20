package com.example.demo.service.streamOperation;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmentWithTheirMaxSalary {
    public static void main(String[] args) {
   getDepartmentWithTheirMaxSalary();
    }

    private static void getDepartmentWithTheirMaxSalary() {
        var employees= List.of(
                new Employee("John",10000,"Maths"),
               new Employee("Marry",40000,"Maths"),
               new Employee("Ram",30000,"Physics"),
               new Employee("Shyam",50000,"Physics")

        );
        Map<String, Optional<Employee>> collect = employees.stream().
                collect(Collectors.groupingBy(Employee::getSubject,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//        System.out.println(collect.values());
        // SECOND HIGHEST SALARY OF AN EMPLOYEE
        long SecondHighSalary=employees.stream().map(Employee::getSalary).
                sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(SecondHighSalary);

    }
}

  class Employee {
    private String name;
    private long salary;
    private String subject;

    // Constructor
    public Employee(String name, long salary, String subject) {
        this.name = name;
        this.salary = salary;
        this.subject = subject;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    // Getter and Setter for subject
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Optional: toString for easy printing
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary='" + salary + "', subject='" + subject + "'}";
    }
}
