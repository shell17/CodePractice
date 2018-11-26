package com.example.helloworld;

public class SearchIndexInRotatedArr {
    public static void main(String[] args){
        int[] arr = {5,6,7,1,2,3,4};
        int indx = search(arr,0,arr.length-1,3);
        System.out.println("Index is " + indx);
    }

    public static int mysearch(int[] arr, int high, int low, int key){
        int mid = (low+high)/2;
        if(arr[mid] < arr[mid+1] ) {
            if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        else{

        }
        return 0;
    }

    private static int search(int[] arr, int high, int low, int key) {
        if(low > high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] == key)
            return mid;

        if(arr[low] <= arr[mid]){
            //means arr[low to mid] is sorted{

            if(key >= arr[low] && key <= arr[mid]){
                return search(arr,low,mid-1,key);
            }
            return search(arr,mid+1,high,key);
        }

        if(key >= arr[mid] && key <= arr[high]){
            return search(arr,mid+1,high,key);
        }
        return(search(arr,low,mid-1,key));

    }
}
