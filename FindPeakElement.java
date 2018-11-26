package com.practice;

public class FindPeakElement {

    public static void main(String[] args){
        int[] arr = {5,6,7,0,1,2,3,4};
        findPeak(arr);

    }

    private static void findPeak(int[] arr) {

        int max =arr[0], index =0;
        for(int i = 1; i<=arr.length-2; i++){
            int prev = arr[i-1];
            int curr = arr[i];
            int next = arr[i+1];

            if(curr > prev && curr > next && curr > max){
                max = curr;
                index = i;
            }
        }
        if(arr[arr.length-1] > max)
            max = arr[arr.length-1];


        System.out.println("max is : " + max);
        System.out.println("index is " + index);
    }
}
