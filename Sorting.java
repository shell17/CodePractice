package com.practice;

import java.util.Arrays;

import static com.example.helloworld.SortingAlgos.insertionSort;

public class Sorting {
    private int[] ar;

    public void quickSort(int[] a){
        this.ar = a;
        quick(0,a.length-1);
    }
    public void quick(int lowerIndex, int higherIndex){

        int i = lowerIndex;
        int j = higherIndex;
        int pivot = ar[lowerIndex + (higherIndex-lowerIndex)/2];

        while(i <= j){
            while(ar[i] < pivot){
                i++;
            }
            while(ar[j] > pivot){
                j--;
            }
            if(i<=j){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j]= temp;
                    i++;j--;
            }
            if(j>lowerIndex){
                quick(lowerIndex,j);
            }
            if(i<higherIndex){
                quick(i,higherIndex);
            }
        }
    }


    public static void mergeSort(int[] a){

        if(a.length < 2){
            return;
        }


        int leftLen = a.length/2;
        int rightLen = a.length - leftLen;
        int[] leftArr = new int[leftLen];
        int[] rightArr = new int[rightLen];

        int i=0;
        for(i=0;i<leftLen;i++){
            leftArr[i] =a[i];
        }

        for(int j=0;j<rightLen;j++){
            rightArr[j]=a[i++];
        }


        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr,rightArr,a);

        System.out.println("Merge sort: " + Arrays.toString(a));
    }
    public static void merge(int[] leftArr, int[] rightArr, int[] a){
        int i=0,j=0,k=0;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i] < rightArr[j]){
                a[k++]=leftArr[i++];
            }
            else if(rightArr[j] < leftArr[i]){
                a[k++]=rightArr[j++];
            }
        }
        while(i<leftArr.length){
            a[k++]=leftArr[i++];
        }

        while(j<rightArr.length){
            a[k++]=rightArr[j++];
        }

    }


    public static void selectionSort(int[] arr){

        for(int i=0; i<arr.length-1;  i++ ){
            int minidx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            if(minidx != i){
                int minnum = arr[minidx];
                arr[minidx] = arr[i];
                arr[i] = minnum;
            }

        }
        System.out.println("Selection sorted: " + Arrays.toString(arr));
    }


    public static void insertionSort(int[] arr){
        //key ele
        for(int i= 1; i< arr.length; i++){
            int key = arr[i];
            int j=i-1;
            //move elem arr[0... i-1] if they are small
            while(j>=0 && arr[j]>key ){
                arr[j+1] =arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

        System.out.println("Insertion sorted: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1; i>=0 ; i--){
            for(int j=1; j<=i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("Bubble sorted: " + Arrays.toString(arr));
    }

    public static void main(String[] args){
        //int[] arr = {3,5,6,4,9,7,1};
        int[] arr = {4,6,2,8,3,5,1};
        //bubbleSort(arr);
        //insertionSort(arr);
        //selectionSort(arr);
        //mergeSort(arr);
        Sorting sa = new Sorting();
        sa.quickSort(arr);
        System.out.println("Quick sorted: " +Arrays.toString(arr));
    }
}


