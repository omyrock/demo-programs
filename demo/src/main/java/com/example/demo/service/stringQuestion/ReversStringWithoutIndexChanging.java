package com.example.demo.service.stringQuestion;

import java.util.Arrays;
import java.util.Comparator;

public class ReversStringWithoutIndexChanging {
    public static void main(String[] args) {
        String string="my name is khan";
        System.out.println(getStringWithoutIndex(string));
    }
    private static String getStringWithoutIndex(String string) {
        String []arrString=string.split(" ");
        String strReverse="";
        for(int i=0; i<arrString.length;i++){
            StringBuilder sb= new StringBuilder(arrString[i]).reverse();
             strReverse+=sb.toString()+" ";
        }
        return strReverse;
    }
}
