package com.example.demo.service.stringQuestion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int a=3;
        getDecimalToBinary(a);
    }

    private static void getDecimalToBinary(int a) {
        String binary="";
          while(a>0){
                int temp=a%2;
                 binary=temp+binary;
                 a=a/2;
          }
        System.out.println(binary);
    }
}
