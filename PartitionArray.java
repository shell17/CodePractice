package com.practice;

import java.util.Arrays;

public class PartitionArray {
    ///partition such that small then K are in lft and >K are in right in place
    public static void partition(int[] arr, int lowerIndex, int higherIndex, int k) {
        int start = lowerIndex;
        int end = higherIndex;
        while (arr[start] < arr[k])
            start++;
        while (arr[end] > arr[k])
            end--;

        while (start <= end) {
            if(start==k){

            }
            while (arr[start] < arr[k])
                start++;
            while (arr[end] > arr[k])
                end--;
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            /*if (start < higherIndex)
                partition(arr, start, higherIndex, k);
            if (end > lowerIndex)
                partition(arr, lowerIndex, end, k);
*/
        }
    }
    public static void partitionArr(int[] arr, int k){
        partition(arr,0,arr.length-1,k);


        System.out.println("Kth element: " + arr[k]);
        System.out.println("Array is " + Arrays.toString(arr));

    }

    public static  void main(String[] args){
        int[] arr = {4,6,2,7,8,3,5};
            //partitionArr(arr,3);
        //System.out.println("Partioned array is: " + Arrays.toString(partitionArr(arr,4)));

    }
}
