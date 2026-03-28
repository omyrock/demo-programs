package com.example.demo.service.streamOperation;

import java.util.Arrays;

public class SortNumbersToFormALargestNumber  {
    public static void main(String[] args) {

        int arr[]={3,30,34,5,9};
        String arrStr[]= new String[arr.length];
        for(int  i=0; i<arr.length; i++){
            arrStr[i]=String.valueOf(arr[i]);
        }
       Arrays.sort(arrStr,(a,b)->(b+a).compareTo(a+b));
         for(String s:arrStr){
             System.out.print(s);
         }



    }


}
