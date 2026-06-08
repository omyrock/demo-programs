package com.example.demo.service;

public class ReplacingFirstAndLastDigits {
    public static void main(String[] args) {
        int a=1234;
        StringBuilder sb =  new StringBuilder();
        String str=String.valueOf(a);
        char []charArray =str.toCharArray();
         for(int i=1; i<charArray.length-1; i++){
             sb.append(charArray[i]);
         }
        System.out.println(charArray[charArray.length-1]+sb.toString()+charArray[0] );
         // WITHOUT METHOD
        replacing(a);
    }

    private static void replacing(int num) {
        int preNumber=num;
         int last=num%10;
         int first=0;
         int pow=1;
         // 1234
        // 1000
         while(num>=10){
             pow=pow*10;
             num=num/10;
             if(num<=9){
                 first=num;
             }
         }
        System.out.println("power is  :"+pow+"   "+ "first digit is "+first);
         int result=preNumber-first*pow-last+last*pow+first;
        System.out.println(result);
//         1234-1000=234
//           234-4=230
//         4000+230=4230+first
    }
}
