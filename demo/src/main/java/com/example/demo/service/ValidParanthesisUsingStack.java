package com.example.demo.service;

import java.util.Stack;

public class ValidParanthesisUsingStack {
    public static void main(String[] args) {
        String str="";
        isValidParanthesis(str);
    }

    private static void isValidParanthesis(String str) {
        Stack<Character> seen= new Stack<>();
        char[] charArray = str.toCharArray();
        for(char ch:charArray){
            if(ch=='('  || ch=='{' || ch=='['){
                seen.push(ch);
            }else{
                if(seen.isEmpty()) {
                    System.out.println("not a valid paranthes");
                    return;
                }
                    char charFromStack = seen.pop();
                    if (charFromStack == '(' && ch != ')' ||
                            charFromStack == '{' && ch != '}' ||
                            charFromStack == '[' && ch != ']') {
                        System.out.println("not a valid paranthesis");
                        return;
                    }

            }

        }
        System.out.println(seen.isEmpty());
        return;
    }
}
