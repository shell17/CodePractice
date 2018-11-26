package com.example.helloworld;

import java.util.Arrays;

public class SortingAlgos {

    //private int[] arr = {7,4,8,9,3,2,10,23,1};
    private int[] arr;

    public static void main(String[] args){
        //int[] a = {4,5,3,7,1,9,8};
        int[] a = {4,5,3,7,1};
        //bubbleSort(a);
        insertionSort(a);
        //selectionSort(a);
        //mergeSort(a);

        SortingAlgos sa = new SortingAlgos();
        sa.quickSort(a);
        System.out.println("Sorted: " +Arrays.toString(a));
    }

    public void quickSort(int[]a){
        this.arr = a;
        quick(0, a.length-1);
    }
    public void quick(int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = arr[lowerIndex + (higherIndex-lowerIndex)/2];

        while (i <= j) {
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j]> pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
        }
        if (lowerIndex< j){
            quick(lowerIndex,j);
        }
        if(higherIndex > i){
            quick(i,higherIndex);
        }
    }

    public static void mergeSort(int[] a){
        if(a.length<2){
            return;
        }
        int leftLen = a.length / 2;
        int rightLen = a.length - leftLen;
        int[] leftArr = new int[leftLen];
        int[] rightArr = new int[rightLen];
        int i=0;
        for(i=0;i<leftLen;i++)
            leftArr[i] = a[i];

        for(int j =0; j< rightLen; j++)
            rightArr[j] = a[i++];

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, a);

        System.out.println("Sorted : " + Arrays.toString(a));
    }

    public static void merge(int[] leftArr, int[] rightArr, int[] a){
        int i=0,j=0,k=0;
        while(i<leftArr.length && j < rightArr.length){
            if(leftArr[i] < rightArr [j]){
                a[k++] = leftArr[i++];
            }
            else if (rightArr[j] < leftArr[i]){
                a[k++] = rightArr[j++];
            }
        }
        while(i<leftArr.length){
            a[k++] = leftArr[i++];
        }
        while(j<rightArr.length){
            a[k++] = rightArr[j++];
        }


    }
    public static void selectionSort(int[] a){

        for(int i=0; i< a.length; i++){
            int smallestIndex = i;
            for(int j =i; j<a.length; j++){
                if(a[j] < a[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int smallestNum = a[smallestIndex];
            a[smallestIndex] = a[i];
            a[i] = smallestNum;
        }

        System.out.println("Sorted : " + Arrays.toString(a));
    }



    public static void insertionSort(int[] a){
        for(int i=1; i< a.length; i++){
            for(int j=i; j>0; j--){
                if(a[j-1] > a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted array : " + Arrays.toString(a));

    }

    public static void bubbleSort(int[] a){
        for (int i = a.length-1; i>=0; i-- ){
            for(int j=1; j<= i; j++){
                if(a[j-1] > a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted array : " + Arrays.toString(a));
    }

}


