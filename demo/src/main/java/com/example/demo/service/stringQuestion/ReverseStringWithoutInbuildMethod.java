package com.example.demo.service.stringQuestion;

public class ReverseStringWithoutInbuildMethod {
    public static void main(String[] args) {
        String string="omvirSingh";
        System.out.println(getReverseString(string));
    }

    private static String getReverseString(String string) {
        StringBuilder sb= new StringBuilder();
        char charArr[]=string.toCharArray();
        for(int i=charArr.length-1; i>=0; i--){
            sb.append(charArr[i]);
        }
        return sb.toString();
    }
}
