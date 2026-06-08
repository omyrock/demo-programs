package com.example.demo.service.staticThings;

import java.util.ArrayList;
import java.util.List;

public class StaticExampleForOutOfMemoryError {
    private static List<String> list= new ArrayList<>();
// if this range go higher we can see the outOfMemoryError here
    // because static context still running in the back and have

    public static void main(String[] args) {
        for(int i=0; i<1000; i++){
            list.add("Numbers "+i);
        }
        System.out.println(list);
    }
}
