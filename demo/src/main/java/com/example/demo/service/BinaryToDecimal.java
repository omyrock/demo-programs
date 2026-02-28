package com.example.demo.service;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String str="011";
//        getBinaryToDecimal(str);
        getBinaryIfStringWithoutInbuiltMethod(str);
    }

    private static void getBinaryIfStringWithoutInbuiltMethod(String str) {
        int dec=0;
        int power=0;
        for(int i=0; i<str.length(); i++) {
            int a = str.charAt(i)-'0';
             dec=dec*2+a;

        }
        System.out.println(dec);

    }

    private static void getBinaryToDecimal(String str) {
          int a=Integer.parseInt(str,2);
        System.out.println(a);
    }
}
