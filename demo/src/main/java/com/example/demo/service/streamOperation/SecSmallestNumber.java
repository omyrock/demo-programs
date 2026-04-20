package com.example.demo.service.streamOperation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecSmallestNumber {
    public static void main(String[] args) {
        List<Integer> list=List.of(2,4,5,3,6,8,1,0,6);
            int minNumber=list.stream().reduce((a,b)->(a<b) ?a :b).get();
            int secSmallestMin=list.stream().filter(x->x!=minNumber).reduce((c,d)->(
                    c<d ?c :d
                    )).get();
        System.out.println(secSmallestMin);
    }
}
