package com.example.demo.service.streamOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorBefore8 {
    public static void main(String[] args) {
  List<Student> students= new ArrayList<>();
        students.add( new Student("om","etah",10));
        students.add( new Student("deep","delhi",5));
        students.add( new Student("yt","dibiyapur",5));
        students.add( new Student(null,"mujuffarpur",11));
        students.add( new Student("aandeep","mujuffarpur",5));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {

                // Compare null values
                if(a.getName()==null && b.getName()==null) return 0;
                if(a.getName()==null) return -1;
                if(b.getName()==null) return 1;

                int i = a.getName().compareTo(b.getName());
                if(i!=0) return i;
                if(a.getAddress()==null && b.getAddress()==null) return 0;

                i = a.getAddress().compareTo(b.getAddress());
                if(i!=0) return i;
                return Integer.compare(a.getRollNumber(),b.getRollNumber());

            }
        });
        for(Student st:students){
            System.out.println(st+" :");
        }
    }
}
class Student {
    private String name;
    private String address;
    private  int rollNumber;

    @Override
    public String toString(){
        return "name :" +name+ " address :"+address+ " rollNumber :"+rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    public Student(String name, String address, int rollNumber) {
        this.name = name;
        this.address = address;
        this.rollNumber = rollNumber;
    }
}
