package com.example.demo.service;


import java.security.SecureRandom;

public class Otp {
    public static void main(String[] args) {
        getOpt();
    }

    private static void getOpt() {

        SecureRandom random= new SecureRandom();
        int i = 100000 + random.nextInt(988888);
        System.out.println(i);


    }
}
