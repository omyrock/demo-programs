package com.example.demo.service.streamOperation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingThroughStream {
    public static void main(String[] args) {
        String string="swiss";
        char ch=string.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c->c,
                        LinkedHashMap::new,Collectors.counting())).
                entrySet().stream()
                .filter(e->e.getValue()==1).
                map(Map.Entry::getKey).findFirst().orElseThrow(null);
        System.out.println(ch);

    }
}
