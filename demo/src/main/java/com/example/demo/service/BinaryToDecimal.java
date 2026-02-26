package com.example.demo.service;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String str="010";
        getBinaryToDecimal(str);
    }

    private static void getBinaryToDecimal(String str) {
          int a=Integer.parseInt(str,2);
        System.out.println(a);
    }
}
