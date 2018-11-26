package com.practice;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] inputArr, int k){

        if(k>inputArr.length){
            k=k%inputArr.length;
        }
        int[] result = new int[inputArr.length];
        for(int i=0; i< k; i++){
            result[i] = inputArr[inputArr.length - k + i];
        }
        int l = 0;
        for(int j =k; j< inputArr.length; j++){
            result[j] = inputArr[l++];
        }

        System.arraycopy(result,0,inputArr,0,inputArr.length);
        return inputArr;
        //here space is O(n) and time is O(n)
    }

    public static int[] rotate2(int[] inputArr, int order){

        //using bubble sort its O(1)
        if(inputArr == null || order <0){
            throw new IllegalArgumentException("Illegal arg");
        }
        for(int i=0; i< order; i++){
            for(int j= inputArr.length-1; j>0; j--){
                int temp = inputArr[j];
                inputArr[j] = inputArr[j-1];
                inputArr[j-1] = temp;
            }
        }
        return inputArr;
    }

    public static int[] rotate3Reversal(int[] arr, int order){
        if(order < 0 || arr == null)
            throw new IllegalArgumentException("Not valid");

        order = order % arr.length;
        int firstPartLength = arr.length - order;

        reverse(arr,0,firstPartLength-1);
        reverse(arr,firstPartLength,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }

    public static void reverse(int[] array, int left, int right){
        if(array.length ==1 || array == null)
            return;
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++; right--;

        }
    }
    public static void main(String[] args){
        int[] inputArr = {1,2,3,4,5,6,7};
        System.out.println("result array is :");
        //System.out.println(Arrays.toString(rotate(inputArr, 4)));

        //System.out.println(Arrays.toString(rotate2(inputArr,4)));
        System.out.println(Arrays.toString(rotate3Reversal(inputArr,4)));

    }

}
