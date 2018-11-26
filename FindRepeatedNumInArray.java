package com.example.helloworld;

import java.util.Arrays;

public class FindRepeatedNumInArray {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,2,4,5,10};
        Arrays.sort(arr);
        for(int i=1; i< arr.length; i++){
            if(arr[i] == arr[i-1]){
                System.out.println("Repeated num is " + arr[i]);
                break;
            }
        }
    }
}
