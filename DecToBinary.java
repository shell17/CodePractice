package com.practice;

public class DecToBinary {

    public static void decToBinary(int n){

        int[] binary = new int[1000];
        int i =0;
        while(n>0){
            binary[i++] = n%2;
            n=n/2;
        }

        //put in string buffer then reverse it and then convert to string;
        for(int j=i-1; j>=0; j--){
            System.out.println(binary[j]);
        }

    }
    public static void main(String[] args){
        decToBinary(4);
    }
}
