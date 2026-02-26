package com.example.demo.service;

public class Prime {
    public static void main(String[] args) {
        int a=5;
        prime(a);
    }

    private static void prime(int a) {
        if(a<0){
            System.out.println(" not a prime number");
            return;
        } if(a==2 || a==3){
            System.out.println(" is a prime number");
            return;
        }
        if(a%2==0 ||a%3==0){
            System.out.println(" not a prime number");
            return;
        }

       long b =(long) Math.sqrt(a);
          for(int i=5; i<b; i=i+6){
              if(b%i==0 || b/(i+2)==0){
                  System.out.println(b+ " is not a prime number");
              }

          }
        System.out.println(a+ " is  a prime number");
    }
}
