package com.practice;

public class BinarySearch {
    public static int findIndexOfA(int[] arr,int num){
        int start=0, end = arr.length - 1;
        int mid=0;
        while(start < end){
            mid = (start + end) /2;
            if(arr[mid] > num){
                //go left
                end = mid -1;
            }
            else if(arr[mid] < num){
                //go right
                start = mid +1;
            }
            else
                break;
        }
        if(num == arr[mid]){
            return mid;
        }
        else
            return -1;



    }
    public static void main(String[] args){
        //int[] arr = {2,3,4,5,6,7,8};
        int[] arr = {1,4,6,8,12,15,17,23,27,40};
        System.out.println("index of 6 is : " + findIndexOfA(arr,23));
    }
}

