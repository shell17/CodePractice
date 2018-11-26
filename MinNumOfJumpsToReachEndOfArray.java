package com.PracticeAgain;

public class MinNumOfJumpsToReachEndOfArray {

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n = minJumps(arr);
    }

    private static int minJumps(int[] a) {

        //i to n
        //start with 1st ele and jum that many jumps no option
        //now get max of jjumps and check if < arr.len - if yes, then get max of all jumps
        //but issue is if i get to secondlast and its not making too last - i am stuck - in that case go back change to some other num
//build jumps array from right to left
        int[] jumps = new int[a.length];


    }
}
