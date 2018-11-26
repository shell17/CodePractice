package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class leftRotateArray    {

    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7};
        System.out.println("Enter d: ");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        leftRotate(arr,d);
        System.out.println("Shifted array: " + Arrays.toString(arr));

    }

    private static void leftRotate(int[] arr, int d) {
        for(int i=0; i<d; i++){
            leftRotateBy1(arr);
        }
    }

    private static void leftRotateBy1(int[] arr) {
        int temp = arr[0];
        for(int i=0; i<arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length -1 ] = temp;
    }
}
