package com.practice;

public class FindMinInRotatedArray {

    public static int findMin(int[] arr){
        return findMin(arr,0,arr.length-1);
    }

    public static int findMin(int[] arr, int left, int right){
        if(left == right)
            return arr[left];
        if(right - left ==1)
            return(Math.min(arr[left],arr[right]));

        int middle = left + (right - left) / 2;
        //not rotated
        if(arr[left] < arr[right]){
            return arr[left];
        }
        else if(arr[middle] > arr[left]){
            findMin(arr,middle,right);
        }
        else{ //go left side
            findMin(arr,left,middle);
        }

        return -1;
    }
    public static  void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println("Min in sorted rotated arr is: " + findMin(arr));
    }
}
