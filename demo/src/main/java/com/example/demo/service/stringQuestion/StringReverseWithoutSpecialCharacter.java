package com.example.demo.service.stringQuestion;

import java.util.Arrays;

public class StringReverseWithoutSpecialCharacter {
    public static void main(String[] args) {
        String string="om*&^v@r";
        getReverseWithoutSpecialCharacter(string);
    }

    private static void getReverseWithoutSpecialCharacter(String string) {
          char chh[]= string.toCharArray();
          int left=0;
          int right=chh.length-1;
            while (left<right){
                if(!Character.isLetter(chh[left])){
                    left++;
                }
                else if(!Character.isLetter(chh[right])){
                     right--;
                }else{
                    char c=chh[left];
                    chh[left]=chh[right];
                    chh[right]=c;
                    left++;
                    right--;
                }
            }
        Arrays.asList(chh).forEach(System.out::print);
    }

}
