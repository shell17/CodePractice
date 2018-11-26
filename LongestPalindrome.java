package com.practice;

public class LongestPalindrome {

    public static boolean isPalindromeString(String s){
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static int longestPalinLen(String str){

        int len =0, maxPalindromeLength=0;
        String longestPalindrome = null;
        //String subStr=null;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1;j<str.length();j++){
                len = j-i;
                String subStr = str.substring(i,j+1);
                if(isPalindromeString(subStr)){
                    if(len > maxPalindromeLength){
                        maxPalindromeLength = len;
                        longestPalindrome = subStr;
                        System.out.println("Longest palin : " + subStr);
                    }

                }
            }
        }

        return maxPalindromeLength;
    }

    public static void matrixPalindrome(String str){
        int[][] table = new int[str.length()][str.length()];
        //initializeTable(table, str.length());
        //single letter is always palindrome
        int length = str.length();
        char[] arr = str.toCharArray();

        String longestStr = null;

        for(int i = 0; i< length; i++){
            table[i][i] = 1;
        }
        //consective letters are palindrome
        for(int j =0; j<= length - 2; j++){
            if(arr[j] == arr[j+1]){
                table[j][j+1] = 1;
                //longestStr =
            }
        }
    }

    private static void initializeTable(int[][] table, int len) {
        for(int i=0; i< len; i++){
            for(int j=0; j< len; j++){
                if(i==j){
                    table[i][j] = 1;
                }
                else
                    table[i][j] = 0;
            }
        }
    }

    public static void main(String[] args){
        String str = "abcddcefe";
        System.out.println("Longest length palindrome: " + longestPalinLen(str));

    }
}
