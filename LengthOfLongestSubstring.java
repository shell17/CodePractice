package com.practice;

public class LengthOfLongestSubstring {

    public static int longestSubstringLength(String str){

        boolean[] flag = new boolean[256];
        char[] arr = str.toCharArray();

        int start =0;int result=0;
        for(int i =0; i< arr.length; i++){
            result = Math.max(result, i-start);
            char ch = arr[i];
            if(flag[ch]){
                //loop restart
                for(int j = start; j<i; j++){
                    if(ch == arr[j]){
                        start = j+1;
                        break;
                    }
                    flag[arr[j]] = false;
                }
            }
            else{
                flag[ch] = true;
            }
        }
        return Math.max(arr.length - start,result);
    }

    public static void main(String[] args){
        String str = "abccdefdhgnklmlcs";
        System.out.println("Longest length: " + longestSubstringLength(str));

    }
}
