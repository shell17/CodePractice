package com.practice;

import java.util.Arrays;

public class carrySum {
    public static void main(String[] args){
        int[] arr1 = {1,1,1};
        int[] arr2 = {1,1,9};

        int[] resArr = sumOfArr(arr1, arr2);
    }

    private static int[] sumOfArr(int[] arr1, int[] arr2) {
        int[] newArr =  new int[arr1.length + arr2.length];
        int sum =0;
        int carry=0;
        for(int i= arr1.length-1; i>=0; i--){
            sum = arr1[i] + arr2[i] + carry;
            if(sum>10){
                carry=1;
            }
            else
                carry =0;

            newArr[i] = sum%10;

        }
        if(carry == 1){
            int[] resArr = new int[newArr.length+1];
            resArr[0] = carry;
            for(int i=0; i<newArr.length;i++)
                resArr[i+1]=newArr[i];

            return resArr;
        }

        return newArr;

    }
}
