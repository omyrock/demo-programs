package com.example.demo.service.Arrays;

public class MaximumSubArrayWithLargestSome {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        getMaxSubArray(arr);
    }
    private static void getMaxSubArray(int[] arr) {
        int max=arr[0];
        int maxValue=arr[0];
        for(int i=1; i<arr.length; i++){
            max=Math.max(arr[i],arr[i]+max);//-1//
            maxValue=Math.max(maxValue,max);//-1//
        }
        System.out.println(maxValue);
    }

}
