package com.example.demo.service.Arrays;

public class SumOfOnlyInteger {
    public static void main(String[] args) {
        Object arr[]={"cg",2,'B',6,"omvir","irmov"};
        getSumOfIntegerOnly(arr);
    }

    private static void getSumOfIntegerOnly(Object[] arr) {
        int sum=0;
        StringBuilder sb= new StringBuilder();

          for(Object obj:arr){
              if(obj instanceof Integer){
                  sum+=(Integer)obj;
              }
          }
        System.out.println(sum);
    }
}
