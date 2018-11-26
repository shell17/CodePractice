package com.PracticeAgain;

public class maxDifferenceInArray {

    public static void main(String[] args){
        int[] arr = {18,10,9,6,4};
        int n = findMaxDiff(arr);
        System.out.println(" max diff : " + n);
    }

    private static int findMaxDiff(int[] a) {
        //O(n2) method is
        int maxdiff=-1;
       /* for(int i=2;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i] > a[j]){
                    int diff = a[i]-a[j];
                    maxdiff = Math.max(diff, maxdiff);
                }
            }
        }*/


       //O(n) method - find min
        int min = a[0];


        for(int i=1; i<a.length; i++){
            if(a[i] > min){
                int diff =a[i] - min;
                maxdiff = Math.max(maxdiff,diff);
            }
            if(a[i] < min)
                min = a[i];
        }

        return maxdiff;
    }
}
