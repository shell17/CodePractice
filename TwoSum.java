package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public static int[] findPairs(int[] arr, int target){
        int[] result = new int[2];
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        while(l<r){
            int sum = arr[l] + arr[r];
            if(sum == target){
                System.out.println("Found");
                result[0]=arr[l];
                result[1]=arr[r];
                return result;
            }
            else if(sum < target){
                l++;
            }
            else
                r--;
        }

        System.out.println("Not found");
        return result;

    }

    public static void main(String[] args){
        int[] arr = {2,4,10,13,14};
        int target = 14;

        //int[] res = findPairs(arr,target);
        //System.out.println("Pairs: " + Arrays.toString(res));

        int[] res1 = findPairsNoSorting(arr, target);
    }

    private static int[] findPairsNoSorting(int[] arr, int target) {
        int[] result = new int[4];
        Set<Integer> differenceSet = new HashSet<Integer>();
        for(int i =0; i<arr.length; i++){
            int diff = target - arr[i];
            if(differenceSet.contains(diff) && diff>=0){
                System.out.println("Pair is " + arr[i] + " " + diff);
            }
            differenceSet.add(arr[i]);
        }
        return result;
    }


}
