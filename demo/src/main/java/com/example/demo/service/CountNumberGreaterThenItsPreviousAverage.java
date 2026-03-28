package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

public class CountNumberGreaterThenItsPreviousAverage {
    public static void main(String[] args) {
        int sum=0,count=0;
        List<Integer> responseTimes= Arrays.asList(100,200,150,300);
        for(int i=1; i<responseTimes.size()+1; i++){
            sum+=responseTimes.get(i-1);
            double dou= (double) (sum/i);
            if(responseTimes.get(i-1)>dou){
                count++;
            }
        }
        System.out.println(count);
    }
}
