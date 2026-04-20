package com.example.demo.service.java17;

public class SwitchExpression {
    public static void main(String[] args) {
        int day=3;
        String result=switch (day){
            case 1 -> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            default -> "other";
        };
        System.out.println(result);
        // cleaner and less error pro
    }
}
