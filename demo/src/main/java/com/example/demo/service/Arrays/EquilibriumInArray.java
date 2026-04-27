package com.example.demo.service.Arrays;

public class EquilibriumInArray {
    public static void main(String[] args) {
        int arr[]={1,3,6,2,2};
        getEquilibrium(arr);
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
