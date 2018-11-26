package com.example.helloworld;

public class FindPrimeNumInArray {
    public static void main(String[] args){
        int[] arr = {1,3,5,10,15};

        for(int i =0 ;i<arr.length; i++){
            int num = arr[i];
            boolean flag=false;
            for(int j=2; j<num; j++){
                if(num%j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Yes num " + num + " is prime");
            }
        }
    }
}
