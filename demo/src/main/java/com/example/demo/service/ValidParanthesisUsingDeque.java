package com.example.demo.service;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParanthesisUsingDeque {
    public static void main(String[] args) {
        String string="()[[]]";
        System.out.println(isValidPara(string));
        // deque can read and write operation from the both of the ends that's why its more fast and better then the stack
        // deque is new interface and stack is old lagacy classes
    }

    private static boolean isValidPara(String string) {
        Deque<Character> seen= new ArrayDeque<>();
        char[] charArray = string.toCharArray();
        for(char cc: charArray){
            if(cc=='(' ||cc=='{' || cc=='[' ){
                seen.addLast(cc);
            }else{
                if(seen.isEmpty()){
                    return false;
                }
                char last = seen.removeLast();
                if( (cc==')' && last!='(')||
                    (cc=='}' && last!='}') ||
                        cc==']' && last!='[' ){
                    return false;
                }

            }
        }
        return seen.isEmpty();
    }
}
