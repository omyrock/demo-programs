package com.example.demo.service.stringQuestion;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String string="abcabcbb";
        getLongestSubStringWithoutRepeatingCharacter(string); 
    }

    private static void getLongestSubStringWithoutRepeatingCharacter(String string) {
        Set<Character> seen= new HashSet<>();
        int left=0;
        int length=0;
        for(int i=0; i<string.length(); i++){
               while(seen.contains(string.charAt(i))){
                     seen.remove(string.charAt(left));
                     left++;

               }
               seen.add(string.charAt(i));//abc
             length=Math.max(length,i-left+1);

        }
        System.out.println(length);
    }

}
