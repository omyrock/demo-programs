package com.example.demo.service.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> seen = new TreeSet<>();
        seen.add(null);
        seen.add("abv");
        System.out.println(seen);
    }
}
