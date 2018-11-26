package com.practice;

public class findPrimeNumInArr {
    public static void main(String[] args){
        int[] arr = {4,2,5,7,8,10,13};
        boolean isPrime = true;
        for(int i = 0; i<arr.length; i++){
            isPrime = true;
            int num = arr[i];
            for(int j=2; j< num; j++){
                if(num%j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println("Prime num is : " + num);
            }
        }
    }
}
