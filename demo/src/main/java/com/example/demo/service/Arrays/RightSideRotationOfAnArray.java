package com.example.demo.service.Arrays;


public class RightSideRotationOfAnArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,3,8,9};
        int target=7;
        int b=arr.length;
        target=target%b;
        getRotation(arr,0,b-1);// reverse entire array
        getRotation(arr,0,target-1);// reverse first target number
        getRotation(arr,target,b-1);// reverse remaining elements

        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    private static void getRotation(int[] arr, int left, int right) {
         while(left<right){
             int temp=arr[left];
             arr[left]=arr[right];
             arr[right]=temp;
             left++;
             right--;
        }
    }
}
