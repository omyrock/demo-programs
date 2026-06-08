package com.example.demo.service.stringQuestion;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String string="abcabcdbb";
        getLongestSubStringWithoutRepeatingCharacter(string); 
    }

    private static void getLongestSubStringWithoutRepeatingCharacter(String string) {
        Set<Character> seen= new HashSet<>();
        int left=0;
        int length=0;
        int startIndex=0;
        for(int i=0; i<string.length(); i++){
               while(seen.contains(string.charAt(i))){
                     seen.remove(string.charAt(left));
                     left++;
               }
               seen.add(string.charAt(i));//abc
             if(length<i-left+1){
                 length=i-left+1;
                 startIndex=left;
             }
        }
        // longestSubStringAlso
        string=string.substring(startIndex,startIndex+length);

        System.out.println(length+" "+ string);
    }

}
