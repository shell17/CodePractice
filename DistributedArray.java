package com.PracticeAgain;

import static com.PracticeAgain.FindKthLargest.partition;

public class DistributedArray {

    public static void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }

    public static  int kthLargest(int[] arr, int k){
        return orderStatistic(arr,arr.length-k + 1,0,arr.length-1);
    }

    private static int orderStatistic(int[] arr, int k, int start, int end) {

        int pivotPosition = partitionAg(arr,start,end);
        if(pivotPosition == (k-1)){
            return arr[pivotPosition];
        }
        else if(pivotPosition > (k-1)){
            return orderStatistic(arr,k,start,pivotPosition-1);
        }
        else{
            return orderStatistic(arr,k,pivotPosition+1,end);
        }


    }

    private static int partitionAg(int[] arr, int start, int end) {

        int pivot = arr[start];
        int pivotPosition = start;
        start++;
        while(start<=end){
            while(start<=end && arr[start]<arr[pivotPosition]){
                start++;
            }
            while(end>= start && arr[end] > arr[pivotPosition]){
                end--;
            }
            if(start>end){
                swap(arr,pivotPosition,end);
            }
            else{
                swap(arr,start,end);
            }
        }
        return end;
    }

    public static void main(String[] args){
        int[] arr = {4,6,2,8,3,5,1};
        //int[] arr = {3,2,1,5,6,4};
        int k = 2;

        System.out.println("Kth laregst: " + kthLargest(arr,k));

    }
}
