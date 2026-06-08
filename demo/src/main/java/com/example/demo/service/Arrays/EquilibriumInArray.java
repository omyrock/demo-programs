package com.example.demo.service.Arrays;

public class EquilibriumInArray {
    public static void main(String[] args) {
        int arr[]={1,0,1,2,-2,-1,5};
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        for(int i=0; i<arr.length; i++){
            int leftSum=sum- arr[i];
            int rightSum=sum-arr[arr.length-1-i];
            if (leftSum==rightSum){
                System.out.println(arr[i]);
            }
        }
//        getEquilibrium(arr);
    }

    private static void getEquilibrium(int[] arr) {
        int sum=0;
        int left=0;
        for(int a:arr){
             sum+=a;
        }
        for(int i=0; i<arr.length; i++){
          int right=sum-left-arr[i];
            if(left==right){
                System.out.println("Equilibrium point is on: "+i+ " index");
            }
            left=left+arr[i];
        }
    }
}
