package com.example.helloworld;

public class getMissingNumberInArray {

    public static int findMissing(int[] a, int n){
        //int total = (n+1)*(n+2)/2;
        int total = n * ((n+1)/2);
        int exp = 0;
        for(int i=0; i<n-1; i++){
            System.out.println("Total is " + total);
            total = total - a[i];
            exp+= a[i];
        }
        return total;

    }
    public static void main(String[] args){
        int a[] = {1,2,4,5,6};
        int missingNum = findMissing(a, a.length +1);
        System.out.println("Missing: " + missingNum);
    }
}
