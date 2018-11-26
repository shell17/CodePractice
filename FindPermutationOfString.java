package com.practice;

public class FindPermutationOfString {

    public static void main(String[] args){
        permutation("abc");
    }

    private static void permutation(String input) {
        permutation("",input);
    }

    private static void permutation(String s, String input) {
        for(int i=0; i<s.length(); i++){
            permutation(s.charAt(i) + input.substring(0,i) + input.substring(i+1,input.length()));
        }
    }
}
