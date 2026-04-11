package com.example.demo.service.streamOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ComparatorJava8Example {

    public static void main(String[] args) {
        List<Stud> list=new ArrayList<>();
        list.add( new Stud("om","etah",10));
        list.add( new Stud("deep","delhi",5));
        list.add( new Stud(null,"dibiyapur",5));
        list.add( new Stud("man","mujuffarpur",11));
        list.add( new Stud("aandeep","mujuffarpur",6));
        Comparator<Stud> comparing = Comparator.comparing(Stud::getName,Comparator.nullsFirst(String::compareTo)).
                thenComparing(Stud::getRollNumber,Comparator.nullsFirst(Integer::compareTo)).
                thenComparing(Stud::getAddress,Comparator.nullsFirst(String::compareTo));
        list.sort(comparing);
        Stud student=list.stream().sorted(Comparator.comparing(Stud::getRollNumber)).skip(1).findFirst().get();
        System.out.println(student.getRollNumber());
        for(Stud stt:list){
           // System.out.println(stt.getName()+ "  "+stt.getRollNumber()+ " "+stt.getAddress());
        }


//        list.stream().sorted(Comparator.comparing(Stud::getName).thenComparing(Stud::getRollNumber));
    }
}
class Stud {
    private String name;
    private String address;
    private  int rollNumber;

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

    public Stud(String name, String address, int rollNumber) {
        this.name = name;
        this.address = address;
        this.rollNumber = rollNumber;
    }

}
