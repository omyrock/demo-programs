package com.example.demo.service.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorType {
    public static void main(String[] args) {
        iterationInList();
    }

    private static void iterationInList() {
        List<String> stringList= new ArrayList<>();
        stringList.add("java");
        stringList.add("core");
        stringList.add("advanced");
       Iterator<String> it =stringList.iterator();
       while (it.hasNext()){
           if(it.next().equals("java")){
               it.remove();
           }
       }
        System.out.println(stringList);

    }
}
