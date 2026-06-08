package com.example.demo.service.stringQuestion;

public class NonIdenticalStringRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2="cdeab";
        //Not not identical
        System.out.println(getNonIdenticalStringRotation(s1,s2));
    }

    private static boolean getNonIdenticalStringRotation(String s1, String s2) {
         if( s1.length()!=s2.length()  && s1.toLowerCase().equals(s2.toLowerCase())){
                return false;
        }
         String s3=s1+s2;
         return  s3.contains(s2);


    }

}
