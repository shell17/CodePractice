package com.example.helloworld;

import java.util.Arrays;

public class RemoveDuplicateAndSaveInSameArr {

    public static void main(String[] args){
        int[] arr = {1,2,2,2,3,4,4};
        int j=0;
        arr[j++] =arr[0];
        for(int i=1;i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                //increment i
            }
            else{
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println("Sorted arr " + Arrays.toString(arr));
    }
}
