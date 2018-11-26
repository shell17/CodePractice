package com.PracticeAgain;

import java.util.Arrays;

public class FindKthLargest {

    public static int findKthUsingSort(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];

    }

    public static  int myKthLargest(int[] arr, int k){
        int pivot = arr[k];
        kthlarge(arr,0,arr.length-1,k);
        return arr[k];
    }

    private static void kthlarge(int[] arr, int lo, int hi, int k) {
        int pivot = arr[k];
        int i = lo;
        int j = hi;;
        while(i<j){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
        }
        if(j>lo){
            kthlarge(arr,lo,j,k);
        }
        if(i<hi){
            kthlarge(arr,i,hi,k);
        }

    }


    public static int findKthLargestElement(int[] arr, int k){
        k = arr.length - k;
        int lo=0;
        int hi = arr.length-1;
        while(lo<hi){
            int j = partition(arr, lo,hi);
            if(j<k){
                lo=j+1;
            }
            else if(j>k){
                hi=j-1;
            }
            else
                break;

        }

        return arr[k];
    }
    public static int partition(int[] a, int lo, int hi){

        int i = lo;
        int j = hi;
        while(true){
            while(i<hi && a[i]<a[lo]){
                i++;
            }
            while(j>lo && a[lo]<a[j]){
                j--;
            }
            if(i>=j){
                break;
            }

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
        int temp = a[lo];
        a[lo] = a[j];
        a[j] = temp;

        return j;
    }

    /*public static int partition(int[] arr, int lo, int hi){
        int i=lo;
        int j=hi+1;
        int pivot = arr[lo];
        while(lo<hi){
            while(lo<hi && arr[hi]>pivot){
                hi--;
            }
            arr[lo] = arr[hi];
            while(lo<hi && arr[lo] < pivot){
                lo++;
            }
            arr[hi] = arr[lo];
        }
        arr[lo] = pivot;
        return lo;
    }*/
    public static void main(String[] args){
        //int[] arr = {4,6,2,8,3,5,1};
        int[] arr = {3,2,1,5,6,4};
        int k = 2;

        System.out.println("Kth laregst: " + findKthLargestElement(arr,k));
        //System.out.println("Kth laregst: " + findKthUsingSort(arr,k));
        //System.out.println("Kth laregst: " + myKthLargest(arr,k));

    }
}


